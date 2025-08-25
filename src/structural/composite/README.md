# Composite Pattern

## Overview
The Composite pattern allows you to treat individual objects and groups of objects uniformly. It composes objects into tree structures to represent part-whole hierarchies.

## Problem
- You need to treat individual objects and groups of objects the same way
- You want to build complex tree structures
- You need to perform operations on both individual and composite objects

## Solution
Create a common interface for both individual objects and groups, allowing them to be treated uniformly.

## Structure
```
Component (Interface)
├── Leaf (Individual Object)
└── Composite (Group of Objects)
```

## Components
- **Component**: Defines the common interface for all objects
- **Leaf**: Represents individual objects (cannot contain others)
- **Composite**: Represents groups that can contain other components

## Example
In this implementation:
- `Shape` is the component interface
- `Circle` and `Square` are leaf components
- `ShapeGroup` is the composite component

## Benefits
- ✅ Treats individual and composite objects uniformly
- ✅ Simplifies client code
- ✅ Easy to add new component types
- ✅ Supports recursive composition

## Usage
```java
Shape circle = new Circle(5, "red");
Shape square = new Square(4, "blue");

ShapeGroup group = new ShapeGroup("My Shapes");
group.addShape(circle);
group.addShape(square);

// Both individual and group can be treated the same way
circle.draw();
group.draw();
```

## Real-world Applications
- File system structures
- GUI component hierarchies
- Organization charts
- Menu systems 