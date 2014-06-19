package com.github.kevinjava.pattern.behavior.chain;

public class ThreeHandler extends NumberHandler {

	@Override
	public void handlerNumber(int number) {
		if (number == 3) {
			System.out.println("handler by ThreeHandler");
		} else {
			if (nextNumberHandler != null) {
				nextNumberHandler.handlerNumber(number);
			} else {
				System.out.println("can't handler this request");
			}
		}
	}

}
