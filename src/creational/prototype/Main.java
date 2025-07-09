package creational.prototype;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select template name using enum
        TemplateName templateName = null;
        while (templateName == null) {
            System.out.print("Choose template name " + java.util.Arrays.toString(TemplateName.values()) + ": ");
            String input = scanner.nextLine();
            for (TemplateName tn : TemplateName.values()) {
                if (tn.name().equalsIgnoreCase(input)) {
                    templateName = tn;
                    break;
                }
            }
            if (templateName == null) {
                System.out.println("Invalid template name. Please try again.");
            }
        }

        // Select template style using enum
        TemplateStyle templateStyle = null;
        while (templateStyle == null) {
            System.out.print("Choose template style " + java.util.Arrays.toString(TemplateStyle.values()) + ": ");
            String input = scanner.nextLine();
            for (TemplateStyle ts : TemplateStyle.values()) {
                if (ts.name().equalsIgnoreCase(input)) {
                    templateStyle = ts;
                    break;
                }
            }
            if (templateStyle == null) {
                System.out.println("Invalid template style. Please try again.");
            }
        }

        Resume template = new Resume(templateName.name(), templateStyle.name());

        System.out.print("How many experiences to add to the template? ");
        int expCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < expCount; i++) {
            System.out.print("Enter company name for experience " + (i + 1) + ": ");
            String company = scanner.nextLine();
            System.out.print("Enter years for experience " + (i + 1) + ": ");
            int years = Integer.parseInt(scanner.nextLine());
            template.addExperience(new Experience(company, years));
        }

        // Shallow clone
        Resume userShallow = template.shallowClone();
        System.out.print("Enter name for shallow clone: ");
        userShallow.name = scanner.nextLine();

        // Deep clone
        Resume userDeep = template.deepClone();
        System.out.print("Enter name for deep clone: ");
        userDeep.name = scanner.nextLine();

        System.out.print("Add an extra experience to deep clone? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter company name: ");
            String company = scanner.nextLine();
            System.out.print("Enter years: ");
            int years = Integer.parseInt(scanner.nextLine());
            userDeep.addExperience(new Experience(company, years));
        }

        // Display before modification
        System.out.println("\nOriginal Template");
        template.display();

        System.out.println("Shallow Copy");
        userShallow.display();

        System.out.println("Deep Copy");
        userDeep.display();

        if (!template.experiences.isEmpty()) {
            System.out.print("\nEnter new company name for the first experience in template: ");
            String newCompany = scanner.nextLine();
            template.experiences.get(0).setCompany(newCompany);
        }

        System.out.println("\nAfter Modifying Template's Experience");
        System.out.println("Original:");
        template.display();
        System.out.println("Shallow Copy (Affected):");
        userShallow.display();
        System.out.println("Deep Copy (Unaffected):");
        userDeep.display();

        scanner.close();
    }
}
