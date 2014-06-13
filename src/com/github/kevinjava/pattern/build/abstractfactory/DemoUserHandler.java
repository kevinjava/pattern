package com.github.kevinjava.pattern.build.abstractfactory;

public class DemoUserHandler extends UserHandler {

	@Override
	public void setShowButtons() {
		System.out.println("show button for demo user");
	}

	@Override
	public void setClickHandler() {
		System.out.println("set click handler for demo user");
	}

}
