package com.github.kevinjava.pattern.struct.flyweight;

public class Car implements FlyWeight {

	@Override
	public void use() {
		System.out.println("drive car back home");
	}

}
