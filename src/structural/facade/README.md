# Facade Pattern

## Overview
The Facade pattern provides a simplified interface to a complex subsystem. It hides the complexity of multiple classes behind a single, easy-to-use interface.

## Problem
- You have a complex subsystem with many classes
- Client code needs to interact with multiple classes
- The subsystem is difficult to use and understand
- You want to reduce dependencies between subsystems

## Solution
Create a facade class that provides a simple interface to the complex subsystem.

## Structure
```
Client → Facade → Complex Subsystem
```

## Components
- **Facade**: Provides a simplified interface to the subsystem
- **Subsystem Classes**: The complex classes that the facade simplifies
- **Client**: Uses the facade instead of the subsystem directly

## Example
In this implementation:
- `HomeTheaterFacade` is the facade
- `Amplifier`, `DvdPlayer`, `Projector`, `Lights` are subsystem classes
- The client uses simple methods like `watchMovie()` and `endMovie()`

## Benefits
- ✅ Simplifies complex subsystems
- ✅ Reduces coupling between subsystems
- ✅ Provides a unified interface
- ✅ Makes the system easier to use

## Usage
```java
// Without Facade - Complex
lights.dim();
projector.on();
projector.setInput("DVD");
amplifier.on();
amplifier.setVolume(8);
dvdPlayer.on();
dvdPlayer.play("Movie");

// With Facade - Simple
HomeTheaterFacade homeTheater = new HomeTheaterFacade();
homeTheater.watchMovie("Movie");
```

## Real-world Applications
- Home automation systems
- Database connection management
- API wrappers
- Legacy system integration 