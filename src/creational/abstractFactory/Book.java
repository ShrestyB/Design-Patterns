package creational.abstractFactory;

class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return name + price + ", Author: " + author;
    }
}