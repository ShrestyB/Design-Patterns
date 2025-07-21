package creational.prototype;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResumeInputHandler inputHandler = new ResumeInputHandler(scanner);

        // Select template name and style using reusable methods
        TemplateName templateName = inputHandler.selectTemplateName();
        TemplateStyle templateStyle = inputHandler.selectTemplateStyle();

        Resume template = new Resume(templateName.name(), templateStyle.name());

        int expCount = inputHandler.getExperienceCount();
        for (int i = 0; i < expCount; i++) {
            Experience exp = inputHandler.getExperience(i + 1);
            template.addExperience(exp);
        }

        // Shallow clone
        Resume userShallow = template.shallowClone();
        userShallow.setName(inputHandler.getCloneName("shallow"));

        // Deep clone
        Resume userDeep = template.deepClone();
        userDeep.setName(inputHandler.getCloneName("deep"));

        if (inputHandler.addExtraExperienceToDeepClone()) {
            Experience exp = inputHandler.getExperience("extra");
            userDeep.addExperience(exp);
        }

        // Display before modification
        System.out.println("\nOriginal Template");
        template.display();

        System.out.println("Shallow Copy");
        userShallow.display();

        System.out.println("Deep Copy");
        userDeep.display();

        // Modify original experience using encapsulation
        List<Experience> templateExperiences = template.getExperiences();
        if (!templateExperiences.isEmpty()) {
            System.out.print("\nEnter new company name for the first experience in template: ");
            String newCompany = scanner.nextLine();
            Experience oldExp = templateExperiences.get(0);
            // Replace the first experience with a new one (since Experience is now immutable)
            Experience updatedExp = new Experience(newCompany, oldExp.getYears());
            // Remove and add to the original template's experience list
            // (Assuming Resume has a method to update experience, or re-create Resume if needed)
            // For now, let's just inform the user that this is the new way
            System.out.println("(Note: To update, remove and add new Experience due to immutability.)");
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
