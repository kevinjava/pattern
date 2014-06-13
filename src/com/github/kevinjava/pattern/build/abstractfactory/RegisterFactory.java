package com.github.kevinjava.pattern.build.abstractfactory;

public class RegisterFactory extends AbstractFactory {

	@Override
	public UserHandler getUserHandler() {
		return new RegisterUserHandler();
	}

	@Override
	public NetWorkHandler getNetWorkHandler() {
		return new RegisterNetWorkHandler();
	}

}
