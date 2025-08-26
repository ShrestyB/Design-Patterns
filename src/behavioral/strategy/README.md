# Strategy Pattern

## Overview
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

## Problem
- You have multiple algorithms for the same task
- You want to switch algorithms at runtime
- You want to avoid conditional statements for algorithm selection
- You need to support multiple ways to perform the same operation

## Solution
Create strategy objects that encapsulate different algorithms and make them interchangeable.

## Structure
```
Context → Strategy Interface ← Concrete Strategies
```

## Components
- **Context**: Uses a strategy object
- **Strategy Interface**: Defines the interface for strategies
- **Concrete Strategies**: Implement specific algorithms

## Example
In this implementation:
- `ShoppingCart` is the context
- `PaymentStrategy` is the strategy interface
- `CreditCardPayment`, `UPIPayment`, `CashPayment` are concrete strategies

## Benefits
- ✅ Encapsulates algorithms
- ✅ Easy to switch strategies at runtime
- ✅ Eliminates conditional statements
- ✅ Supports new algorithms without changing existing code

## Usage
```java
ShoppingCart cart = new ShoppingCart();

cart.setPaymentStrategy(new CreditCardPayment("1234"));
cart.checkout(1000);

cart.setPaymentStrategy(new UPIPayment("user@bank"));
cart.checkout(500);
```

## Real-world Applications
- Payment processing systems
- Sorting algorithms
- Compression algorithms
- Validation strategies
- Pricing strategies 