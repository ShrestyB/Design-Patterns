package creational.prototype;


public enum TemplateName {
    PROFESSIONAL("Professional"),
    ACADEMIC("Academic"), 
    CREATIVE("Creative"),
    BASIC("Basic"),
    ADVANCED("Advanced"),
    PRO("Pro");

    private final String displayName;

    TemplateName(String displayName) {
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