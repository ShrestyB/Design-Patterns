
# Builder Pattern – Java Example

This project demonstrates the **Builder** design pattern in Java. The pattern is used to construct complex objects step by step, allowing for more readable and maintainable code, especially when dealing with many optional parameters.

## Structure

- **Checkout.java**: The main class representing a checkout process, with a static inner `CheckoutBuilder` class for building `Checkout` objects.
- **Main.java**: Entry point; demonstrates how to use the builder to create `Checkout` objects.

## How It Works

1. **Checkout** objects are created using the `CheckoutBuilder`.
2. The builder enforces required fields (cart items and shipping address) and allows optional fields (payment method, discount code).
3. The `build()` method validates all required fields and constructs an immutable `Checkout` object.
4. The `getDetails()` method displays the checkout information in a user-friendly format.


## Key Features

- **Immutability**: All fields in `Checkout` are final and set only via the builder.
- **Validation**: The builder checks for required fields and throws clear exceptions if missing.
- **Flexible Construction**: Optional fields can be set or omitted as needed.

## Design Pattern Benefits

- **Builder** separates the construction of a complex object from its representation.
- Makes code more readable and maintainable when dealing with many parameters.
- Ensures objects are always in a valid state.
