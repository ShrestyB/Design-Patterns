package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addProduct(new Book("Java Design Patterns", 500));
        cart.addProduct(new Electronics("Laptop", 50000));
        cart.addProduct(new Book("Clean Code", 400));
        
        PriceVisitor priceVisitor = new PriceVisitor();
        
        System.out.println("Shopping Cart\n");
        cart.accept(priceVisitor);
        System.out.println("Total Price: Rs" + priceVisitor.getTotalPrice());
    }
} 