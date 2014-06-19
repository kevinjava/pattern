package com.github.kevinjava.pattern.behavior.command;

public class SaoKaoReceiver implements Receiver {

	@Override
	public void doAction() {
		System.out.println("烧烤");
	}

}
