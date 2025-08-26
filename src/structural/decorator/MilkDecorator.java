package structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    private static final double MILK_COST = 0.5;
    
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    
    @Override
    public double getCost() {
        return validateCost(coffee.getCost() + MILK_COST);
    }
} 