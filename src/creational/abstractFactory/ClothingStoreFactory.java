package creational.abstractFactory;

class ClothingStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String additionalDetail) {
        if (additionalDetail == null || additionalDetail.trim().isEmpty()) {
            throw new IllegalArgumentException("Size cannot be null or empty");
        }
        return new Clothing(name, price, additionalDetail.trim());
    }
}
