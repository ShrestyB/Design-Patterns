package behavioral.state;

public class VendingMachine {
    private VendingMachineState state;
    
    public VendingMachine() {
        state = new IdleState(this);
    }
    
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public void insertCoin() {
        state.insertCoin();
    }
    
    public void selectProduct() {
        state.selectProduct();
    }
    
    public void dispense() {
        state.dispense();
    }
} 