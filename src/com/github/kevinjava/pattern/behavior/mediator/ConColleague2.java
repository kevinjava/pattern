package com.github.kevinjava.pattern.behavior.mediator;

public class ConColleague2 extends Colleague {

	@Override
	void notify(String message) {
		System.out.println("ConColleague2 receive the message: " + message);
	}

}
