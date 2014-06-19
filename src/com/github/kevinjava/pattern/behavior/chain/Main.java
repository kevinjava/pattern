package com.github.kevinjava.pattern.behavior.chain;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberHandler handler = new OneHandler();
		NumberHandler handler1 = new TwoHandler();
		NumberHandler handler2 = new ThreeHandler();
		handler.setNumberHandler(handler1);
		handler1.setNumberHandler(handler2);
		handler.handlerNumber(1);
		handler.handlerNumber(2);
		handler.handlerNumber(3);
		handler.handlerNumber(4);
	}

}
