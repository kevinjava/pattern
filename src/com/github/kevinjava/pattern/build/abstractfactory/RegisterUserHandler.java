package com.github.kevinjava.pattern.build.abstractfactory;

public class RegisterUserHandler extends UserHandler {

	@Override
	public void setShowButtons() {
		System.out.println("show button for real user");
	}

	@Override
	public void setClickHandler() {
		System.out.println("set click handler for real user");
	}

}
