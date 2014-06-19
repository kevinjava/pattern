package com.github.kevinjava.pattern.behavior.templete;

public class ClothToy extends ToyTemplete {

	@Override
	protected void createHead() {
		System.out.println("create cloth head");
	}

	@Override
	protected void createBody() {
		System.out.println("create cloth body");
	}

	@Override
	protected void createLeg() {
		System.out.println("create cloth leg");
	}

	@Override
	protected void createFoot() {
		System.out.println("create cloth foot");
	}

}
