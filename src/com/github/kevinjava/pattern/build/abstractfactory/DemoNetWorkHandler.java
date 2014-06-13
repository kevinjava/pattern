package com.github.kevinjava.pattern.build.abstractfactory;

public class DemoNetWorkHandler extends NetWorkHandler {

	@Override
	public void handlerLoginRequest() {
		System.out.println("Demo model, not send the request");
	}

	@Override
	public void handlerGetUserInfo() {
		System.out.println("Demo model, not send the request");
	}

}
