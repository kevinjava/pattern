package com.github.kevinjava.pattern.behavior.interpreter;


public abstract class SymbolExpression extends Expression {
	Expression left;
	Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

}
