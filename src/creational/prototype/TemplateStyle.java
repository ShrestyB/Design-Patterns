package creational.prototype;


public enum TemplateStyle {
    MODERN("Modern"),
    CLASSIC("Classic"),
    MINIMAL("Minimal"),
    ELEGANT("Elegant"),
    BOLD("Bold");

    private final String displayName;

    TemplateStyle(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
} 