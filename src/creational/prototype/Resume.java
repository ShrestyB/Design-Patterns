package creational.prototype;

import java.util.ArrayList;
import java.util.List;

class Resume implements Cloneable {
    private String name;
    private final String templateStyle;
    private final List<Experience> experiences;

    public Resume(String name, String templateStyle) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (templateStyle == null || templateStyle.trim().isEmpty()) {
            throw new IllegalArgumentException("Template style cannot be null or empty");
        }
        this.name = name.trim();
        this.templateStyle = templateStyle.trim();
        this.experiences = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name.trim();
    }

    public String getTemplateStyle() {
        return templateStyle;
    }

    public List<Experience> getExperiences() {
        return new ArrayList<>(experiences);
    }

    public void addExperience(Experience exp) {
        if (exp == null) throw new IllegalArgumentException("Experience cannot be null");
        experiences.add(exp);
    }

    public void updateExperience(int index, Experience newExp) {
        if (newExp == null) throw new IllegalArgumentException("Experience cannot be null");
        if (index < 0 || index >= experiences.size()) throw new IndexOutOfBoundsException("Invalid experience index");
        experiences.set(index, newExp);
    }

    public Resume shallowClone() {
        try {
            Resume clone = (Resume) super.clone();
            // Shallow copy: experiences list reference is shared
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Shallow cloning Resume failed: " + e.getMessage(), e);
        }
    }

    public Resume deepClone() {
        try {
            List<Experience> clonedList = new ArrayList<>();
            for (Experience exp : this.experiences) {
                clonedList.add(exp.clone());
            }
            
            Resume result = new Resume(this.name, this.templateStyle);
            for (Experience exp : clonedList) {
                result.addExperience(exp);
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException("Deep cloning Resume failed: " + e.getMessage(), e);
        }
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Template: ").append(templateStyle).append("\n");
        sb.append("Experience: ");
        for (Experience e : experiences) {
            sb.append(e).append(" | ");
        }
        sb.append("\n-----------------------");
        System.out.println(sb.toString());
    }
}
