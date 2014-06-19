package com.github.kevinjava.pattern.behavior.interpreter;

import java.util.HashMap;

public abstract class Expression {

	public abstract int interpreter(HashMap<String, String> values);
}
