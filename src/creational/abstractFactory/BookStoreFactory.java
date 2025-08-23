package creational.abstractFactory;

class BookStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String additionalDetail) {
        if (additionalDetail == null || additionalDetail.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        return new Book(name, price, additionalDetail.trim());
    }
}
