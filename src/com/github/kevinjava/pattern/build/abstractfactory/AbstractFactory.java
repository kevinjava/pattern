package com.github.kevinjava.pattern.build.abstractfactory;

public abstract class AbstractFactory {
	public abstract UserHandler getUserHandler();
	public abstract NetWorkHandler getNetWorkHandler();
}
