package com.github.kevinjava.pattern.behavior.templete;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ToyTemplete clothToy = new ClothToy();
		clothToy.createToy();
		ToyTemplete ironToy = new IronToy();
		ironToy.createToy();
	}

}
