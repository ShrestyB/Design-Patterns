package behavioral.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid Rs" + amount + " in cash");
    }
} 