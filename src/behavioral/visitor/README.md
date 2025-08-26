# Visitor Pattern

## Overview
The Visitor pattern represents an operation to be performed on elements of an object structure. It lets you define a new operation without changing the classes of the elements on which it operates.

## Problem
- You need to perform operations on objects of different classes
- You want to add new operations without modifying existing classes
- You have a complex object structure
- You want to separate algorithms from object structure

## Solution
Create visitor objects that define operations and visit elements to perform those operations.

## Structure
```
Client → Object Structure → Elements
                ↓
            Visitor
```

## Components
- **Element Interface**: Defines the accept method
- **Concrete Elements**: Implement the accept method
- **Visitor Interface**: Defines visit methods for each element type
- **Concrete Visitors**: Implement specific operations
- **Object Structure**: Contains elements and accepts visitors

## Example
In this implementation:
- `Product` is the element interface
- `Book`, `Electronics` are concrete elements
- `Visitor` is the visitor interface
- `PriceVisitor` is the concrete visitor
- `ShoppingCart` is the object structure

## Benefits
- ✅ Adds new operations without changing elements
- ✅ Separates algorithms from object structure
- ✅ Supports multiple visitors
- ✅ Easy to add new element types

## Usage
```java
ShoppingCart cart = new ShoppingCart();
cart.addProduct(new Book("Java", 500));
cart.addProduct(new Electronics("Laptop", 50000));

PriceVisitor visitor = new PriceVisitor();
cart.accept(visitor);
System.out.println("Total: " + visitor.getTotalPrice());
```

## Real-world Applications
- Shopping cart calculations
- Document processing
- Compiler operations
- Report generation
- Data analysis tools 