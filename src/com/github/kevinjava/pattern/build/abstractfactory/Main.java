package com.github.kevinjava.pattern.build.abstractfactory;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory factory = new RegisterFactory();
		System.out.println("---current is the real user--");
		print(factory);
		System.out.println("---current is the Demo user--");
		factory = new DemoFactory();
		print(factory);
	}
	
	static void print(AbstractFactory factory){
		factory.getUserHandler().setClickHandler();
		factory.getUserHandler().setShowButtons();
		factory.getNetWorkHandler().handlerLoginRequest();
		factory.getNetWorkHandler().handlerGetUserInfo();
	}

}
