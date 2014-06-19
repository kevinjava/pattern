package com.github.kevinjava.pattern.behavior.mediator;

public abstract class Colleague {
	Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	abstract void notify(String message);

	void send(String message) {
		mediator.send(this, message);
	}
}
