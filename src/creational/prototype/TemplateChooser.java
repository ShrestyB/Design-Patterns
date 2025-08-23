package creational.prototype;

import java.util.Scanner;

public class TemplateChooser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
            if (templateName == null) System.out.println("Invalid template name. Please try again.");
        }

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
            if (templateStyle == null) System.out.println("Invalid template style. Please try again.");
        }

        System.out.println("You have chosen template name: " + templateName + " and template style: " + templateStyle);
    }
}