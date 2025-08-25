# Chain of Responsibility Pattern

## Overview
The Chain of Responsibility pattern passes requests along a chain of handlers until one of them handles the request. It decouples the sender from the receiver by giving multiple objects a chance to handle the request.

## Problem
- You have multiple objects that can handle a request
- You want to avoid coupling the sender to specific receivers
- You want to give multiple objects a chance to handle the request
- You need to process requests in a specific order

## Solution
Create a chain of handler objects where each handler either processes the request or passes it to the next handler in the chain.

## Structure
```
Client → Handler 1 → Handler 2 → Handler 3
```

## Components
- **Handler Interface**: Defines the interface for handling requests
- **Abstract Handler**: Base class with common functionality
- **Concrete Handlers**: Specific handlers that process requests
- **Client**: Initiates requests to the chain

## Example
In this implementation:
- `SupportHandler` is the handler interface
- `AbstractSupportHandler` is the base handler
- `Level1Support`, `Level2Support`, `Level3Support` are concrete handlers
- The client creates a chain and sends requests

## Benefits
-  Decouples sender from receivers
-  Allows multiple objects to handle requests
-  Easy to add new handlers
-  Flexible request processing

## Usage
```java
SupportHandler level1 = new Level1Support();
SupportHandler level2 = new Level2Support();
SupportHandler level3 = new Level3Support();

level1.setNext(level2);
level2.setNext(level3);

level1.handleRequest("I forgot my password");
```

## Real-world Applications
- Customer support systems
- Exception handling
- Event processing
- Middleware chains 