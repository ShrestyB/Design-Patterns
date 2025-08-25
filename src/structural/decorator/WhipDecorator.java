package structural.decorator;

public class WhipDecorator extends CoffeeDecorator {
    private static final double WHIP_COST = 0.7;
    
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }
    
    @Override
    public double getCost() {
        return validateCost(coffee.getCost() + WHIP_COST);
    }
} 