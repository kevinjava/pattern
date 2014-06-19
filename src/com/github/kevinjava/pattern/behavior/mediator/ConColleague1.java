package com.github.kevinjava.pattern.behavior.mediator;

public class ConColleague1 extends Colleague {

	public ConColleague1() {
	}

	@Override
	void notify(String message) {
		System.out.println("ConColleague1 receive the message: " + message);
	}

}
