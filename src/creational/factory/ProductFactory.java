package creational.factory;

public class ProductFactory {
    public Product createProduct(ProductType type, String name, double price, String additionalDetail) {
        switch (type) {
            case ELECTRONICS:
                int warranty;
                try {
                    warranty = Integer.parseInt(additionalDetail);
                    if (warranty < 0) {
                        throw new IllegalArgumentException("Warranty cannot be negative");
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid warranty format. Please enter a valid number.");
                }
                return new Electronics(name, price, warranty);
            case CLOTHING:
                if (additionalDetail == null || additionalDetail.trim().isEmpty()) {
                    throw new IllegalArgumentException("Size cannot be null or empty");
                }
                return new Clothing(name, price, additionalDetail.trim());
            case BOOK:
                if (additionalDetail == null || additionalDetail.trim().isEmpty()) {
                    throw new IllegalArgumentException("Author cannot be null or empty");
                }
                return new Book(name, price, additionalDetail.trim());
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}