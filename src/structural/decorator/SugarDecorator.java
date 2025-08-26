package structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    private static final double SUGAR_COST = 0.2;
    
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
    
    @Override
    public double getCost() {
        return validateCost(coffee.getCost() + SUGAR_COST);
    }
} 