package behavioral.visitor;

public class Book implements Product {
    private String title;
    private double price;
    
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    public String getTitle() {
        return title;
    }
} 