package com.github.kevinjava.pattern.behavior.mediator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Colleague colleague1 = new ConColleague1();
		Colleague colleague2 = new ConColleague2();
		Mediator mediator = new MediatorImple(colleague1, colleague2);
		colleague1.setMediator(mediator);
		colleague2.setMediator(mediator);
		colleague1.send("hello i'm colleague1");
		colleague2.send("hello i'm colleague2");
	}

}
