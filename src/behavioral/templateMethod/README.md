# Template Method Pattern

## Overview
The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps without changing the algorithm's structure.

## Problem
- You have an algorithm with fixed steps but variable implementations
- You want to avoid code duplication
- You need to ensure the algorithm structure remains consistent
- You want to allow subclasses to customize specific steps

## Solution
Create a template method that defines the algorithm structure and allows subclasses to override specific steps.

## Structure
```
Abstract Class (Template Method)
├── Concrete Class 1
└── Concrete Class 2
```

## Components
- **Abstract Class**: Defines the template method and abstract steps
- **Concrete Classes**: Implement the abstract steps
- **Template Method**: Defines the algorithm structure

## Example
In this implementation:
- `CoffeeTemplate` is the abstract class with template method
- `BlackCoffee`, `MilkCoffee` are concrete classes
- `makeCoffee()` is the template method

## Benefits
-  Prevents code duplication
-  Ensures consistent algorithm structure
-  Allows customization of specific steps
-  Easy to add new variations

## Usage
```java
CoffeeTemplate blackCoffee = new BlackCoffee();
blackCoffee.makeCoffee();

CoffeeTemplate milkCoffee = new MilkCoffee();
milkCoffee.makeCoffee();
```

## Real-world Applications
- Coffee making processes
- Document generation
- Build processes
- Data processing pipelines
- Algorithm frameworks 