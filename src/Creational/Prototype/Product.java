package Creational.Prototype;
public class Product implements Prototype {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public Product cloneProduct() {
        return new Product(this.name, this.price, this.category);
    }

    public String getDetails() {
        return "Product: " + name + ", Price: Rs." + price + ", Category: " + category;
    }

    public void setName(String name) {
        this.name = name;
    }
}
