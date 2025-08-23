

# Factory Pattern – Java Example

This project demonstrates the **Factory Method** design pattern in Java. The pattern is used to create objects without specifying the exact class of object that will be created.

## Structure

- **Product.java**: Abstract base class for all products.
- **ProductType.java**: Enum for product types (`ELECTRONICS`, `CLOTHING`, `BOOK`).
- **Book.java, Clothing.java, Electronics.java**: Concrete product classes.
- **ProductFactory.java**: Factory class that creates products based on type and input.
- **Main.java**: Entry point; handles user input and demonstrates the pattern.

## How It Works

1. **User chooses a product type** (electronics, clothing, or book).
2. **Main** maps the input to a `ProductType` enum and passes it to the factory.
3. **User enters product details** (name, price, and a type-specific detail).
4. The **factory creates the product** with validation.
5. **Product details are displayed** in a consistent format.


## Key Features

- **Type safety**: Uses enums instead of raw strings for product types.
- **Validation**: All user input is validated with clear error messages.
- **Extensible**: Add new product types by extending the enum, creating a new product class, and updating the factory.


## Design Pattern Benefits

- **Factory Method** centralizes object creation logic.
- Decouples client code from concrete classes.
- Makes it easy to add new product types.

