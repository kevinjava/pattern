package com.github.kevinjava.pattern.behavior.visitor;

public class Factory implements Location {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
