# Observer Pattern

## Overview
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Problem
- You have objects that need to be notified when another object changes
- You want to maintain loose coupling between objects
- You need to support multiple observers
- You want to avoid tight coupling between subject and observers

## Solution
Create a subject that maintains a list of observers and notifies them of state changes.

## Structure
```
Subject → Observer 1
      → Observer 2
      → Observer 3
```

## Components
- **Subject**: Maintains observers and notifies them of changes
- **Observer Interface**: Defines the update method
- **Concrete Observers**: Implement the update method
- **Client**: Creates and manages subjects and observers

## Example
In this implementation:
- `WeatherStation` is the subject
- `WeatherObserver` is the observer interface
- `PhoneDisplay`, `TVDisplay` are concrete observers

## Benefits
- ✅ Loose coupling between subject and observers
- ✅ Supports multiple observers
- ✅ Easy to add/remove observers
- ✅ Automatic notification of changes

## Usage
```java
WeatherStation station = new WeatherStation();
PhoneDisplay phone = new PhoneDisplay("User");
TVDisplay tv = new TVDisplay("Living Room");

station.addObserver(phone);
station.addObserver(tv);

station.setMeasurements(25, 65, 1013);
```

## Real-world Applications
- Weather monitoring systems
- Event handling systems
- Model-View-Controller (MVC)
- Stock market updates
- Social media notifications 