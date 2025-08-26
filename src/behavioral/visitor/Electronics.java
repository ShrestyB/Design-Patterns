package behavioral.visitor;

public class Electronics implements Product {
    private String name;
    private double price;
    
    public Electronics(String name, double price) {
        this.name = name;
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
    
    public String getName() {
        return name;
    }
} 