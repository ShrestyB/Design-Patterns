package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Paid Rs" + amount + " using Credit Card ending with " + 
                          cardNumber.substring(cardNumber.length() - 4));
    }
} 