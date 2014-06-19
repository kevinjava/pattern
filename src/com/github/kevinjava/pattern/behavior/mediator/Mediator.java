package com.github.kevinjava.pattern.behavior.mediator;

public interface Mediator {
	void send(Colleague colleague, String message);
}
