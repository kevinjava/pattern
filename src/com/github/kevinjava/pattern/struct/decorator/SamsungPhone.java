package com.github.kevinjava.pattern.struct.decorator;

public class SamsungPhone extends PhoneDecorator {
	@Override
	public void phoneDesc() {
		super.phoneDesc();
		System.out.println("i'm Samsung brand");
	}
}
