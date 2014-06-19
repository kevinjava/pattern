package com.github.kevinjava.pattern.struct.decorator;

public class CameraPhone extends PhoneDecorator {
	@Override
	public void phoneDesc() {
		super.phoneDesc();
		System.out.println("i'm a phone with camera");
	}
}
