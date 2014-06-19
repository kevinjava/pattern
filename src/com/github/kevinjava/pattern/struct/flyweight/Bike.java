package com.github.kevinjava.pattern.struct.flyweight;

public class Bike implements FlyWeight {

	@Override
	public void use() {
		System.out.println("use bike back home");
	}

}
