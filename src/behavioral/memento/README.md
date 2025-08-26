# Memento Pattern

## Overview
The Memento pattern captures and externalizes an object's internal state so that the object can be restored to this state later without violating encapsulation.

## Problem
- You need to save and restore an object's state
- You want to implement undo/redo functionality
- You need to capture object state without exposing internal details
- You want to maintain object encapsulation

## Solution
Create a memento object that stores the state and a caretaker that manages the mementos.

## Structure
```
Originator → Memento ← Caretaker
```

## Components
- **Originator**: Creates and uses mementos to save/restore state
- **Memento**: Stores the internal state of the originator
- **Caretaker**: Manages and stores mementos

## Example
In this implementation:
- `TextEditor` is the originator
- `TextMemento` is the memento
- `TextHistory` is the caretaker

## Benefits
- ✅ Preserves encapsulation
- ✅ Supports undo/redo operations
- ✅ Easy to implement state restoration
- ✅ Maintains object integrity

## Usage
```java
TextEditor editor = new TextEditor();
TextHistory history = new TextHistory();

editor.write("Hello");
history.save(editor.save());

editor.write(" World");
history.save(editor.save());

// Undo
TextMemento memento = history.undo();
editor.restore(memento);
```

## Real-world Applications
- Text editors with undo/redo
- Game save/load systems
- Database transactions
- Configuration management
- State management in applications 