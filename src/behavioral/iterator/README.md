# Iterator Pattern

## Overview
The Iterator pattern provides a way to access elements of a collection without exposing its underlying representation. It allows you to traverse a collection without knowing its internal structure.

## Problem
- You need to access elements of a collection
- You want to hide the collection's internal structure
- You need different ways to traverse the same collection
- You want to support multiple simultaneous traversals

## Solution
Create an iterator object that encapsulates the traversal logic and provides a standard interface for accessing elements.

## Structure
```
Client → Collection → Iterator → Elements
```

## Components
- **Collection Interface**: Defines methods for creating iterators
- **Concrete Collection**: Implements the collection interface
- **Iterator Interface**: Defines methods for traversing elements
- **Concrete Iterator**: Implements the traversal logic

## Example
In this implementation:
- `Playlist` is the collection interface
- `MusicPlaylist` is the concrete collection
- `Iterator` is the iterator interface
- `MusicIterator` is the concrete iterator

## Benefits
- ✅ Hides collection implementation details
- ✅ Supports multiple traversal algorithms
- ✅ Provides uniform interface for different collections
- ✅ Supports multiple simultaneous iterations

## Usage
```java
Playlist playlist = new MusicPlaylist();
playlist.addSong(new Song("Song 1", "Artist 1"));
playlist.addSong(new Song("Song 2", "Artist 2"));

Iterator iterator = playlist.createIterator();
while (iterator.hasNext()) {
    Song song = iterator.next();
    System.out.println("Playing: " + song);
}
```

## Real-world Applications
- Music players
- File system traversal
- Database result sets
- GUI component collections
- Custom data structures 