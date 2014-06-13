package com.github.kevinjava.pattern.build.abstractfactory;

public class DemoFactory extends AbstractFactory {

	@Override
	public UserHandler getUserHandler() {
		return new DemoUserHandler();
	}

	@Override
	public NetWorkHandler getNetWorkHandler() {
		return new DemoNetWorkHandler();
	}

}
