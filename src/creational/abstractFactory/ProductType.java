package creational.abstractFactory;

public enum ProductType {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    BOOK("Book");

    private final String displayName;

    ProductType(String displayName) {
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