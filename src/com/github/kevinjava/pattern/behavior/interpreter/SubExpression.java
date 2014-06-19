package com.github.kevinjava.pattern.behavior.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, String> values) {
		return left.interpreter(values) - right.interpreter(values);
	}

}
