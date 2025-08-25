# Bridge Pattern

## Overview
The Bridge pattern decouples an abstraction from its implementation so that both can vary independently. It uses composition over inheritance to achieve this flexibility.

## Problem
- You have an abstraction and implementation that are tightly coupled
- You want to extend both the abstraction and implementation independently
- Inheritance creates a rigid structure that's hard to modify

## Solution
Separate the abstraction from its implementation and use composition to bridge them.

## Structure
```
Abstraction → Implementation Interface ← Concrete Implementations
```

## Components
- **Abstraction**: Defines the interface for the abstraction
- **Refined Abstraction**: Extends the abstraction with specific functionality
- **Implementation**: Defines the interface for the implementation
- **Concrete Implementation**: Provides specific implementation

## Example
In this implementation:
- `Shape` is the abstraction
- `Circle` and `Square` are refined abstractions
- `DrawAPI` is the implementation interface
- `RedCircle` and `GreenCircle` are concrete implementations

## Benefits
- ✅ Decouples abstraction from implementation
- ✅ Allows both to vary independently
- ✅ Promotes composition over inheritance
- ✅ Follows Open/Closed Principle

## Usage
```java
DrawAPI redDrawer = new RedCircle();
DrawAPI greenDrawer = new GreenCircle();

Shape redCircle = new Circle(100, 100, 10, redDrawer);
Shape greenCircle = new Circle(100, 100, 10, greenDrawer);

redCircle.draw();   // Red circle
greenCircle.draw(); // Green circle
```

## Real-world Applications
- GUI frameworks
- Database drivers
- Device drivers
- Platform-specific implementations 