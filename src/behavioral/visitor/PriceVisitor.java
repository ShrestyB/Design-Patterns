package behavioral.visitor;

public class PriceVisitor implements Visitor {
    private double totalPrice = 0;
    
    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
        System.out.println("Book: " + book.getTitle() + " - Rs" + book.getPrice());
    }
    
    @Override
    public void visit(Electronics electronics) {
        totalPrice += electronics.getPrice();
        System.out.println("Electronics: " + electronics.getName() + " - Rs" + electronics.getPrice());
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
} 