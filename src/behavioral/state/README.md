# State Pattern

## Overview
The State pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Problem
- An object's behavior depends on its state
- You have many conditional statements based on state
- State transitions are complex
- You want to avoid large conditional statements

## Solution
Create state objects that represent different states and encapsulate state-specific behavior.

## Structure
```
Context → State Interface ← Concrete States
```

## Components
- **Context**: Maintains a reference to a state object
- **State Interface**: Defines the interface for states
- **Concrete States**: Implement state-specific behavior

## Example
In this implementation:
- `VendingMachine` is the context
- `VendingMachineState` is the state interface
- `IdleState`, `HasCoinState`, `SoldState` are concrete states

## Benefits
- ✅ Eliminates large conditional statements
- ✅ Encapsulates state-specific behavior
- ✅ Makes state transitions explicit
- ✅ Easy to add new states

## Usage
```java
VendingMachine machine = new VendingMachine();

machine.insertCoin();    // Idle → HasCoin
machine.selectProduct(); // HasCoin → Sold
machine.dispense();      // Sold → Idle
```

## Real-world Applications
- Vending machines
- Game state management
- Order processing systems
- Workflow engines
- Traffic light systems 