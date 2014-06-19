package com.github.kevinjava.pattern.behavior.command;

public class CofferReceiver implements Receiver {

	@Override
	public void doAction() {
		System.out.println("冲咖啡");
	}

}
