package com.github.kevinjava.pattern.behavior.visitor;

public class StudentParents implements Visitor {

	@Override
	public void visit(Shool shool) {
		System.out.println("Student parents visit shool");
	}

	@Override
	public void visit(Factory factory) {
		System.out.println("Student parents visit factory");
	}

}
