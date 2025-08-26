package behavioral.interpreter;

public class ExpressionParser {
    public static Expression parse(String expression) {
        String[] parts = expression.split(" ");
        
        if (parts.length == 1) {
            return new NumberExpression(Integer.parseInt(parts[0]));
        }
        
        if (parts.length == 3) {
            Expression left = new NumberExpression(Integer.parseInt(parts[0]));
            Expression right = new NumberExpression(Integer.parseInt(parts[2]));
            
            if (parts[1].equals("+")) {
                return new AddExpression(left, right);
            } else if (parts[1].equals("-")) {
                return new SubtractExpression(left, right);
            }
        }
        
        throw new IllegalArgumentException("Invalid expression: " + expression);
    }
} 