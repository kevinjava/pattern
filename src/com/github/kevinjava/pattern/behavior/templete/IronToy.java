package com.github.kevinjava.pattern.behavior.templete;

public class IronToy extends ToyTemplete {

	@Override
	protected void createHead() {
		System.out.println("create iron head");
	}

	@Override
	protected void createBody() {
		System.out.println("create iron body");
	}

	@Override
	protected void createLeg() {
		System.out.println("create iron leg");
	}

	@Override
	protected void createFoot() {
		System.out.println("create iron foot");
	}

}
