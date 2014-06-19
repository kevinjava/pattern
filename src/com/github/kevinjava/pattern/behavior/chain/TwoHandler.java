package com.github.kevinjava.pattern.behavior.chain;

public class TwoHandler extends NumberHandler {

	@Override
	public void handlerNumber(int number) {
		if (number == 2) {
			System.out.println("handler by TwoHandler");
		} else {
			if(nextNumberHandler != null){
				nextNumberHandler.handlerNumber(number);
			}else {
				System.out.println("can't handler this request");
			}
		}
	}

}
