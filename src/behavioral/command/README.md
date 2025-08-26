# Command Pattern

## Overview
The Command pattern encapsulates a request as an object, allowing you to parameterize clients with different requests, queue operations, and support undo operations.

## Problem
- You need to decouple the requester from the receiver
- You want to support undo/redo operations
- You need to queue operations
- You want to support macro operations (combining multiple commands)

## Solution
Create command objects that encapsulate requests and can be executed, queued, or undone.

## Structure
```
Client → Invoker → Command → Receiver
```

## Components
- **Command Interface**: Defines the interface for executing commands
- **Concrete Commands**: Implement specific commands
- **Receiver**: Knows how to perform the operations
- **Invoker**: Asks the command to carry out the request
- **Client**: Creates and configures commands

## Example
In this implementation:
- `Command` is the command interface
- `LightOnCommand`, `LightOffCommand` are concrete commands
- `Light` is the receiver
- `RemoteControl` is the invoker

## Benefits
-  Decouples requester from receiver
-  Supports undo/redo operations
-  Easy to add new commands
-  Supports macro operations

## Usage
```java
Light light = new Light("Living Room");
Command lightOn = new LightOnCommand(light);
Command lightOff = new LightOffCommand(light);

RemoteControl remote = new RemoteControl();
remote.setCommand(0, lightOn, lightOff);

remote.onButtonPressed(0);  // Turn on
remote.offButtonPressed(0); // Turn off
remote.undoButtonPressed(); // Undo
```

## Real-world Applications
- Remote controls
- Menu systems
- Undo/redo functionality
- Macro recording
- Transaction processing 