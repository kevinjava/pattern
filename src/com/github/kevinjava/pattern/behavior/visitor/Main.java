package com.github.kevinjava.pattern.behavior.visitor;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor v1 = new StudentParents();
		Visitor v2 = new OfficerVisitor();
		Guard guard = new Guard();
		guard.accept(v1);
		guard.accept(v2);
	}

}
