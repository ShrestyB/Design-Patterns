package behavioral.state;

public class IdleState implements VendingMachineState {
    private VendingMachine machine;
    
    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        machine.setState(new HasCoinState(machine));
    }
    
    @Override
    public void selectProduct() {
        System.out.println("Please insert a coin first");
    }
    
    @Override
    public void dispense() {
        System.out.println("Please insert a coin first");
    }
} 