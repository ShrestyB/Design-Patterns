package behavioral.strategy;

public class UPIPayment implements PaymentStrategy {
    private String upiId;
    
    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Paid Rs" + amount + " using UPI: " + upiId);
    }
} 