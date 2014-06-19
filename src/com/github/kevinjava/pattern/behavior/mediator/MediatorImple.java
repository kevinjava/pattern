package com.github.kevinjava.pattern.behavior.mediator;

public class MediatorImple implements Mediator {
	Colleague colleague1;
	Colleague colleague2;

	public MediatorImple(Colleague colleague1, Colleague colleague2) {
		this.colleague1 = colleague1;
		this.colleague2 = colleague2;
	}

	@Override
	public void send(Colleague colleague, String message) {
		if (colleague == colleague1) {
			colleague2.notify(message);
		} else if (colleague2 == colleague) {
			colleague1.notify(message);
		}

	}

}
