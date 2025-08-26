package behavioral.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        System.out.println("Vending Machine\n");
        
        machine.selectProduct(); // Should fail
        machine.insertCoin();    // Should work
        machine.insertCoin();    // Should fail
        machine.selectProduct(); // Should work
        machine.dispense();      // Should work
        machine.insertCoin();    // Should work again
    }
} 