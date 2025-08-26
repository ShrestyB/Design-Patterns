package behavioral.state;

public class HasCoinState implements VendingMachineState {
    private VendingMachine machine;
    
    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Product selected");
        machine.setState(new SoldState(machine));
    }
    
    @Override
    public void dispense() {
        System.out.println("Please select a product first");
    }
} 