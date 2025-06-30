package Creational.factory;

class ProductFactory {
    public static Product createProduct(String type, String name, double price, String extraInfo) {
        switch (type) {
            case "Clothing":
                return new Clothing(name, price, extraInfo);
            case "Electronics":
                return new Electronics(name, price, Integer.parseInt(extraInfo));
            case "Book":
                return new Book(name, price, extraInfo);
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}
