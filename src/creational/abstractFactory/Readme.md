
# Abstract Factory Pattern – Java Example

This project demonstrates the **Abstract Factory** design pattern in Java. The pattern is used to create families of related objects (products) without specifying their concrete classes.

## Structure

- **Product.java**: Abstract base class for all products.
- **ProductType.java**: Enum for product types (`ELECTRONICS`, `CLOTHING`, `BOOK`).
- **Book.java, Clothing.java, Electronics.java**: Concrete product classes.
- **StoreFactory.java**: Factory interface for creating products.
- **BookStoreFactory.java, ClothingStoreFactory.java, ElectronicsStoreFactory.java**: Concrete factories for each product type.
- **Main.java**: Entry point; handles user input and demonstrates the pattern.

## How It Works

1. **User chooses a product type** (electronics, clothing, or book).
2. **Main** maps the input to a `ProductType` enum and selects the appropriate factory.
3. **User enters product details** (name, price, and a type-specific detail).
4. The **factory creates the product** with validation.
5. **Product details are displayed** in a consistent format.



## Key Features

- **Type safety**: Uses enums instead of raw strings.
- **Validation**: All user input is validated with clear error messages.
- **Extensible**: Add new product types by extending the enum, creating a new product class, and a new factory.
- **Consistent output**: All products use the same formatting for details.


## Design Pattern Benefits

- **Abstract Factory** decouples client code from concrete classes.
- Makes it easy to add new product families.
- Centralizes validation and creation logic.
