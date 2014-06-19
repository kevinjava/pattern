package com.github.kevinjava.pattern.behavior.visitor;

public class OfficerVisitor implements Visitor {

	@Override
	public void visit(Shool shool) {
		System.out.println("OfficerVisitor visit shool");
	}

	@Override
	public void visit(Factory factory) {
		System.out.println("OfficerVisitor visit factory");
	}

}
