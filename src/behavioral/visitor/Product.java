package behavioral.visitor;

public interface Product {
    void accept(Visitor visitor);
    double getPrice();
} 