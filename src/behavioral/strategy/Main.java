package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        System.out.println("Payment Methods\n");
        
        // Pay with credit card
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        cart.checkout(1000);
        
        // Pay with UPI
        cart.setPaymentStrategy(new UPIPayment("user@bank"));
        cart.checkout(500);
        
        // Pay with cash
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(200);
    }
} 