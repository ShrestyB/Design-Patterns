package behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Calculator\n");
        
        // Simple expressions
        Expression expression1 = ExpressionParser.parse("5 + 3");
        System.out.println("5 + 3 = " + expression1.interpret());
        
        Expression expression2 = ExpressionParser.parse("10 - 4");
        System.out.println("10 - 4 = " + expression2.interpret());
        
        Expression expression3 = ExpressionParser.parse("7");
        System.out.println("7 = " + expression3.interpret());
        
        // Complex expression (manually built)
        Expression complex = new AddExpression(
            new NumberExpression(5),
            new SubtractExpression(
                new NumberExpression(10),
                new NumberExpression(3)
            )
        );
        System.out.println("5 + (10 - 3) = " + complex.interpret());
    }
} 