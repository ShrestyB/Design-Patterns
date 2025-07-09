package creational.prototype;

import java.util.ArrayList;
import java.util.List;

class Resume implements Cloneable {
    String name;
    String templateStyle;
    List<Experience> experiences;

    public Resume(String name, String templateStyle) {
        this.name = name;
        this.templateStyle = templateStyle;
        this.experiences = new ArrayList<>();
    }

    public void addExperience(Experience exp) {
        experiences.add(exp);
    }

    public Resume shallowClone() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Shallow cloning failed");
        }
    }

    public Resume deepClone() {
        try {
            Resume clone = (Resume) super.clone();
            clone.experiences = new ArrayList<>();
            for (Experience exp : this.experiences) {
                clone.experiences.add((Experience) exp.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Deep cloning failed");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Template: " + templateStyle);
        System.out.print("Experience: ");
        for (Experience e : experiences) {
            System.out.print(e + " | ");
        }
        System.out.println("\n-----------------------");
    }
}
