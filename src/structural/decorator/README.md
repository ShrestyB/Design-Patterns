# Decorator Pattern

## Overview
The Decorator pattern allows you to dynamically add new behaviors or responsibilities to objects without altering their existing code. It provides a flexible alternative to subclassing for extending functionality.

## Problem
- You need to add new functionality to objects at runtime
- Subclassing would lead to an explosion of classes
- You want to combine multiple behaviors in different ways
- You need to add/remove responsibilities dynamically

## Solution
Create a wrapper class (decorator) that implements the same interface as the original object and delegates calls to it while adding new behavior.

## Structure
```
Component (Interface)
├── ConcreteComponent (Base Object)
└── Decorator (Abstract Wrapper)
    ├── ConcreteDecoratorA
    ├── ConcreteDecoratorB
    └── ConcreteDecoratorC
```

## Components in This Implementation

### 1. **Component Interface** (`Coffee`)
```java
public interface Coffee {
    String getDescription();
    double getCost();
}
```
- Defines the common interface for both concrete components and decorators

### 2. **Concrete Component** (`SimpleCoffee`)
```java
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
    
    @Override
    public double getCost() {
        return 2.0;
    }
}
```
- The base object that can be decorated

### 3. **Abstract Decorator** (`CoffeeDecorator`)
```java
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
}
```
- Base decorator class that wraps a Coffee object
- Delegates calls to the wrapped object

### 4. **Concrete Decorators**
- **`MilkDecorator`**: Adds milk to coffee
- **`SugarDecorator`**: Adds sugar to coffee  
- **`WhipDecorator`**: Adds whipped cream to coffee

## How It Works

### Basic Usage
```java
// Start with simple coffee
Coffee coffee = new SimpleCoffee();

// Add milk
Coffee coffeeWithMilk = new MilkDecorator(coffee);

// Add sugar to the coffee with milk
Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
```

### Dynamic Composition
```java
// Different combinations
Coffee justSugar = new SugarDecorator(new SimpleCoffee());
Coffee milkAndWhip = new WhipDecorator(new MilkDecorator(new SimpleCoffee()));
Coffee everything = new WhipDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee())));
```

## Benefits
- **Open/Closed Principle**: Open for extension, closed for modification
- **Single Responsibility**: Each decorator has one specific responsibility
- **Flexible Composition**: Mix and match decorators in any order
- **Runtime Behavior**: Add/remove behaviors dynamically
- **No Class Explosion**: Avoid creating many subclasses

## Real-world Applications
- **GUI Components**: Adding borders, scrollbars, tooltips
- **I/O Streams**: Buffering, compression, encryption
- **Coffee Shop**: Adding toppings, flavors, sizes
- **Text Processing**: Bold, italic, underline formatting
- **Middleware**: Logging, caching, authentication


## Key Design Principles
1. **Composition over Inheritance**: Uses composition to extend behavior
2. **Interface Segregation**: All components implement the same interface
3. **Dependency Inversion**: Depends on abstractions, not concretions
4. **Single Responsibility**: Each decorator has one specific purpose

## When to Use
-  Need to add responsibilities dynamically
-  Want to avoid subclassing for every combination
-  Need to add/remove responsibilities at runtime
-  Want to keep classes focused on single responsibilities

## When Not to Use
- Simple inheritance would suffice
- Performance is critical (decorators add overhead)
- The component interface is unstable
- You need to access the original object directly 