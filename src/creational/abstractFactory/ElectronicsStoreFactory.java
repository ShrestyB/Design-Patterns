package creational.abstractFactory;

class ElectronicsStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String additionalDetail) {
        try {
            int warranty = Integer.parseInt(additionalDetail);
            if (warranty < 0) {
                throw new IllegalArgumentException("Warranty cannot be negative");
            }
            return new Electronics(name, price, warranty);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid warranty format. Please enter a valid number.");
        }
    }
}