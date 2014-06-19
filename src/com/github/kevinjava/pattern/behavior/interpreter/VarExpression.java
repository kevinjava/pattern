package com.github.kevinjava.pattern.behavior.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression {
	
	private String key;
	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, String> values) {
		return Integer.valueOf(values.get(key));
	}

}
