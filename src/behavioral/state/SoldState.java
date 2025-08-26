package behavioral.state;

public class SoldState implements VendingMachineState {
    private VendingMachine machine;
    
    public SoldState(VendingMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing product");
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Product already selected");
    }
    
    @Override
    public void dispense() {
        System.out.println("Product dispensed");
        machine.setState(new IdleState(machine));
    }
} 