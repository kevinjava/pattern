package com.github.kevinjava.pattern.behavior.chain;

public class OneHandler extends NumberHandler {

	@Override
	public void handlerNumber(int number) {
		if(number == 1){
			System.out.println("handler by oneHandler");
		}else{
			if(nextNumberHandler != null){
				nextNumberHandler.handlerNumber(number);
			}else {
				System.out.println("can't handler this request");
			}
			
		}
			
	}

}
