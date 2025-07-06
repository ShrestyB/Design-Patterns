package creational.factory;

public class ProductFactory {

    public static Product createProduct(ProductType type, String name, double price, String additionalDetail) {
        switch (type) {
            case CLOTHING:
                return new Clothing(name, price, additionalDetail);
            case ELECTRONICS:
                int warranty;
                try {
                    warranty = Integer.parseInt(additionalDetail);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Warranty must be a valid integer.");
                }
                return new Electronics(name, price, warranty);
            case BOOK:
                return new Book(name, price, additionalDetail);
            default:
                throw new IllegalArgumentException("Invalid product type.");
        }
    }
}