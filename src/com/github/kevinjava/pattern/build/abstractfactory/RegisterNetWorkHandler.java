package com.github.kevinjava.pattern.build.abstractfactory;

public class RegisterNetWorkHandler extends NetWorkHandler {

	@Override
	public void handlerLoginRequest() {
		System.out.println("send login request");
	}

	@Override
	public void handlerGetUserInfo() {
		System.out.println("send get user info request");
	}

}
