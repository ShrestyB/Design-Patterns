package structural.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
    
    @Override
    public double getCost() {
        return coffee.getCost();
    }
    
    protected double validateCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative: " + cost);
        }
        return cost;
    }
} 