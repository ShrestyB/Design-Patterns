# Prototype Pattern – Java Example

This project demonstrates the **Prototype** design pattern in Java. The pattern is used to create new objects by copying existing ones (prototypes), allowing for efficient object creation and flexible cloning (shallow and deep copies).

## Structure

- **Experience.java**: Represents a work experience entry (immutable, cloneable).
- **Resume.java**: Represents a resume, supports shallow and deep cloning, and displays details.
- **ResumeInputHandler.java**: Handles all user input and validation for building resumes.
- **Main.java**: Entry point; demonstrates prototype usage, cloning, and modification.
- **TemplateName.java, TemplateStyle.java**: Enums for template selection.
- **TemplateChooser.java**: (Optional) Standalone template selection demo.

## How It Works

1. **User selects a resume template and style** using enums.
2. **User adds experiences** to the template.
3. The program creates a **shallow clone** and a **deep clone** of the template.
4. The user can modify the clones and the original independently.
5. The program demonstrates the difference between shallow and deep cloning.


## Key Features

- **Shallow and deep cloning**: Demonstrates the difference and use cases.
- **Immutability**: `Experience` objects are immutable for safety.
- **Extensible**: Easy to add new fields or template types.

## Design Pattern Benefits

- **Prototype** enables efficient object creation by cloning.
- Reduces the cost of creating complex objects.
- Allows for flexible object modification and extension.

