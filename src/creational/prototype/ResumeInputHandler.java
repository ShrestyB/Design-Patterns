package creational.prototype;

import java.util.Scanner;

class ResumeInputHandler {
    private final Scanner scanner;

    public ResumeInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public TemplateName selectTemplateName() {
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
        return templateName;
    }

    public TemplateStyle selectTemplateStyle() {
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
        return templateStyle;
    }

    public int getExperienceCount() {
        int count = 0;
        while (true) {
            System.out.print("How many experiences to add to the template? ");
            String input = scanner.nextLine();
            try {
                count = Integer.parseInt(input);
                if (count < 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid non-negative integer.");
            }
        }
        return count;
    }

    public Experience getExperience(int index) {
        System.out.print("Enter company name for experience " + index + ": ");
        String company = scanner.nextLine();
        int years = 0;
        while (true) {
            System.out.print("Enter years for experience " + index + ": ");
            String input = scanner.nextLine();
            try {
                years = Integer.parseInt(input);
                if (years < 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid non-negative integer for years.");
            }
        }
        return new Experience(company, years);
    }

    public Experience getExperience(String label) {
        System.out.print("Enter company name for " + label + " experience: ");
        String company = scanner.nextLine();
        int years = 0;
        while (true) {
            System.out.print("Enter years for " + label + " experience: ");
            String input = scanner.nextLine();
            try {
                years = Integer.parseInt(input);
                if (years < 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid non-negative integer for years.");
            }
        }
        return new Experience(company, years);
    }

    public String getCloneName(String type) {
        System.out.print("Enter name for " + type + " clone: ");
        return scanner.nextLine();
    }

    public boolean addExtraExperienceToDeepClone() {
        System.out.print("Add an extra experience to deep clone? (yes/no): ");
        return scanner.nextLine().trim().equalsIgnoreCase("yes");
    }
} 