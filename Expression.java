//package edu.csus.csc130.demo;

import java.util.Stack;

public class Expression {
	
	public static double evaluateExpression(String expression) {
		Stack<String> operatorStack = new Stack<String>();
		Stack<Double> operandStack = new Stack<Double>();
		String[] parts = expression.split(" ");
		for (int i=0; i<parts.length; i++) {
			String part = parts[i];
			if (part.equals("(")) { // ignore
			} else if (part.equals(")")) {
				double operand2 = operandStack.pop();
				double operand1 = operandStack.pop();
				String operator = operatorStack.pop();
				Double result = calculate(operand1, operand2, operator);
				operandStack.push(result);
			} else if (isOperator(part)) {
				operatorStack.push(part);
			} else {
				operandStack.push(Double.valueOf(part));
			}
		}
		return operandStack.pop();
	}
	
    private static Double calculate(double operand1, double operand2, String operator) {
        if ("+".equals(operator)) {
            return operand1 + operand2;
        } else if ("-".equals(operator)) {
            return operand1 - operand2;
        } else if ("*".equals(operator)) {
            return operand1 * operand2;
        } else if ("/".equals(operator)) {
            return operand1 / operand2;
        } else {
            return null;
        }
    }
    
    private static boolean isOperator(String s) {
        return s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-");
    }   
    
    public static void main(String[] args) {
        String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        Double result = evaluateExpression(expression);
        System.out.println(expression + " = " + result);
    }    


}
