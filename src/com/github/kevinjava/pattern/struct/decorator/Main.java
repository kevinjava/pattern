package com.github.kevinjava.pattern.struct.decorator;

/**
 * 动态的为对象 增加功能
 * @author kevliu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone android = new Android();
		PhoneDecorator decorator = new SamsungPhone();
		PhoneDecorator cameraDecorator = new CameraPhone();
		cameraDecorator.setPhone(android);
		decorator.setPhone(cameraDecorator);
		decorator.phoneDesc();
	}

}
