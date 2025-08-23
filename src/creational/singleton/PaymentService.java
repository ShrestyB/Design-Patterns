package creational.singleton;

public class PaymentService {
    public void processPayment() {
        Logger logger = Logger.getInstance();
        logger.log("Initiating payment for Order #123", LogLevel.INFO);
        logger.log("Payment failed due to insufficient funds", LogLevel.ERROR);
    }
}

