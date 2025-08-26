# Adapter Pattern

## Overview
The Adapter pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping an existing class with a new interface.

## Problem
- You have an existing class with a useful interface
- You need to use it with a different interface that's incompatible
- You don't want to modify the existing class

## Solution
Create an adapter class that implements the target interface and delegates calls to the existing class.

## Structure
```
Client → Target Interface ← Adapter → Adaptee (Existing Class)
```

## Components
- **Target Interface**: The interface the client expects
- **Adapter**: Implements the target interface and wraps the adaptee
- **Adaptee**: The existing class with incompatible interface
- **Client**: Uses the target interface

## Example
In this implementation:
- `MediaPlayer` is the target interface
- `MediaAdapter` is the adapter
- `AdvancedMediaPlayer` implementations are the adaptees
- `AudioPlayer` is the client

## Benefits
- ✅ Allows incompatible interfaces to work together
- ✅ Promotes code reusability
- ✅ Follows Single Responsibility Principle
- ✅ Follows Open/Closed Principle

## Usage
```java
AudioPlayer player = new AudioPlayer();
player.play("mp3", "song.mp3");  // Direct support
player.play("mp4", "video.mp4"); // Through adapter
player.play("vlc", "movie.vlc"); // Through adapter
```

## Real-world Applications
- Database adapters
- API wrappers
- Legacy system integration
- Third-party library integration 