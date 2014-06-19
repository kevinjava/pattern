package com.github.kevinjava.pattern.behavior.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, String> values) {
		return left.interpreter(values) + right.interpreter(values);
	}

}
