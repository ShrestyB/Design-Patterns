# Flyweight Pattern

## Overview
The Flyweight pattern reduces memory usage by sharing common parts of state between multiple objects. It's used when you need to create a large number of similar objects efficiently.

## Problem
- You need to create many similar objects
- Memory usage becomes a concern
- Many objects share common state
- You want to optimize memory usage

## Solution
Separate intrinsic (shared) state from extrinsic (unique) state and share the intrinsic state between objects.

## Structure
```
Client → Flyweight Factory → Flyweight Objects
```

## Components
- **Flyweight**: Contains shared state (intrinsic)
- **Flyweight Factory**: Manages and caches flyweight objects
- **Context**: Contains unique state (extrinsic) and references flyweight
- **Client**: Uses flyweight objects through the factory

## Example
In this implementation:
- `CharacterStyle` is the flyweight (shared formatting properties)
- `StyleFactory` is the flyweight factory
- `Character` is the context (unique character + shared style)
- The client creates characters with shared styles

## Benefits
- ✅ Reduces memory usage
- ✅ Improves performance
- ✅ Shares common state efficiently
- ✅ Scales well with large numbers of objects

## Usage
```java
// Create shared styles
CharacterStyle redStyle = StyleFactory.getStyle("Arial", 12, "red");
CharacterStyle blueStyle = StyleFactory.getStyle("Times", 14, "blue");

// Create characters using shared styles
Character c1 = new Character('H', redStyle);
Character c2 = new Character('e', redStyle);
Character c3 = new Character('W', blueStyle);

// Memory efficient: 3 characters, only 2 style objects
```

## Real-world Applications
- Text editors (character formatting)
- Game development (tile systems)
- GUI frameworks (widget styling)
- Database connection pooling 