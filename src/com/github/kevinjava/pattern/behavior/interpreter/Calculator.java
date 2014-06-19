package com.github.kevinjava.pattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	String expression;

	public Calculator(String expression) {
		this.expression = expression;
	}

	public void getValue(HashMap<String, String> values) {
		Stack<Expression> stack = new Stack<>();
		char[] ex = expression.toCharArray();
		Expression left;
		Expression right;
		for (int i=0; i<ex.length;i++) {
			switch (ex[i]) {
			case '+':
				left = stack.pop();
				right = new VarExpression(String.valueOf(ex[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(ex[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				stack.push(new VarExpression(String.valueOf(ex[i])));
				break;
			}
		}
		System.out.println(stack.pop().interpreter(values));
	}
}
