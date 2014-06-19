package com.github.kevinjava.pattern.behavior.chain;

public abstract class NumberHandler {

	protected NumberHandler nextNumberHandler;

	public void setNumberHandler(NumberHandler nextNumberHandler) {
		this.nextNumberHandler = nextNumberHandler;
	}

	public abstract void handlerNumber(int number);
}
