# Interpreter Pattern

## Overview
The Interpreter pattern provides a way to evaluate language grammar or expressions. It involves implementing an expression interface that tells how to interpret a particular context.

## Problem
- You need to interpret a language or grammar
- You have a simple language to parse
- You want to represent grammar rules as objects
- You need to evaluate expressions dynamically

## Solution
Create an abstract syntax tree (AST) where each node represents a grammar rule or expression.

## Structure
```
Abstract Expression
├── Terminal Expression (Numbers)
└── Non-terminal Expression (Operations)
```

## Components
- **Abstract Expression**: Defines the interpret method
- **Terminal Expression**: Represents basic elements (numbers, variables)
- **Non-terminal Expression**: Represents operations (add, subtract)
- **Context**: Contains information needed during interpretation
- **Client**: Builds the expression tree and calls interpret

## Example
In this implementation:
- `Expression` is the abstract expression interface
- `NumberExpression` is the terminal expression
- `AddExpression`, `SubtractExpression` are non-terminal expressions
- `ExpressionParser` builds the expression tree

## Benefits
- Easy to extend grammar
- Each grammar rule is represented as a class
- Easy to implement new expressions
- Maintains grammar rules as objects

## Usage
```java
Expression expression = ExpressionParser.parse("5 + 3");
int result = expression.interpret(); // Returns 8

Expression complex = new AddExpression(
    new NumberExpression(5),
    new SubtractExpression(
        new NumberExpression(10),
        new NumberExpression(3)
    )
);
int result = complex.interpret(); // Returns 12
```

## Real-world Applications
- Mathematical expression evaluators
- SQL parsers
- Regular expression engines
- Configuration file parsers
- Domain-specific languages (DSLs) 