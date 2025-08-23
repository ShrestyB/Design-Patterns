package creational.abstractFactory;

class Electronics extends Product {
    private int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String getDetails() {
        return name + " - Rs." + price + ", Warranty: " + warranty + " years";
    }
}