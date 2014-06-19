package com.github.kevinjava.pattern.behavior.command;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Command coffer = new CommandImpl(new CofferReceiver());
		Command saokao = new CommandImpl(new SaoKaoReceiver());
		Invoker invoker = new Invoker();
		invoker.add(coffer);
		invoker.add(saokao);
		invoker.takeOrder();
	}

}
