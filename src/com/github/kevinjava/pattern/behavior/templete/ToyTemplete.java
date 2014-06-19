package com.github.kevinjava.pattern.behavior.templete;

public abstract class ToyTemplete {

	void createToy() {
		createHead();
		createBody();
		createLeg();
		createFoot();
	}

	protected abstract void createHead();

	protected abstract void createBody();

	protected abstract void createLeg();

	protected abstract void createFoot();
}
