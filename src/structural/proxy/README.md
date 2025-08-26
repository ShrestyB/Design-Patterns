# Proxy Pattern

## Overview
The Proxy pattern provides a surrogate or placeholder for another object to control access to it. It's used to add a level of indirection when accessing an object.

## Problem
- You need to control access to an object
- You want to add functionality without changing the original object
- You need to delay expensive operations until they're actually needed
- You want to add security, caching, or logging

## Solution
Create a proxy object that implements the same interface as the real object and controls access to it.

## Structure
```
Client → Proxy → Real Object
```

## Components
- **Subject Interface**: Defines the common interface for both proxy and real object
- **Real Subject**: The actual object that the proxy represents
- **Proxy**: Controls access to the real subject and may add functionality
- **Client**: Uses the subject interface

## Example
In this implementation:
- `Image` is the subject interface
- `RealImage` is the real subject (expensive image loading)
- `ProxyImage` is the proxy (lazy loading)
- The client uses the same interface for both

## Benefits
- ✅ Controls access to objects
- ✅ Provides lazy loading
- ✅ Adds functionality without changing original
- ✅ Improves performance through caching

## Usage
```java
// Proxy - loads only when needed
Image proxyImage = new ProxyImage("photo.jpg");
// No loading happens yet

proxyImage.display(); // Now it loads and displays
proxyImage.display(); // No loading - already cached

// Real - loads immediately
Image realImage = new RealImage("photo.jpg"); // Loads immediately
```

## Real-world Applications
- Image loading (lazy loading)
- Database connections (connection pooling)
- Remote objects (RMI, web services)
- Access control and security 