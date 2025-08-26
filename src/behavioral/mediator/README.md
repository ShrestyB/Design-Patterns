# Mediator Pattern

## Overview
The Mediator pattern defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly.

## Problem
- You have many objects that need to communicate with each other
- Direct communication creates tight coupling
- The communication logic becomes complex and hard to maintain
- You want to centralize communication logic

## Solution
Create a mediator object that handles all communication between objects, reducing direct dependencies.

## Structure
```
Colleague 1 → Mediator → Colleague 2
Colleague 3 ↗        ↖ Colleague 4
```

## Components
- **Mediator Interface**: Defines communication methods
- **Concrete Mediator**: Implements the communication logic
- **Colleague Interface**: Defines methods for colleagues
- **Concrete Colleagues**: Objects that communicate through mediator

## Example
In this implementation:
- `ChatMediator` is the mediator interface
- `ChatRoom` is the concrete mediator
- `User` is the colleague interface
- `ChatUser` is the concrete colleague

## Benefits
- ✅ Reduces coupling between objects
- ✅ Centralizes communication logic
- ✅ Simplifies object interactions
- ✅ Easy to add new colleagues

## Usage
```java
ChatMediator chatRoom = new ChatRoom();
User alice = new ChatUser(chatRoom, "Alice");
User bob = new ChatUser(chatRoom, "Bob");

chatRoom.addUser(alice);
chatRoom.addUser(bob);

alice.send("Hello everyone!");
```

## Real-world Applications
- Chat applications
- Air traffic control systems
- GUI frameworks
- Event handling systems
- Workflow management 