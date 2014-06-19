package com.github.kevinjava.pattern.struct.flyweight;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Bike").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Car").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Metro").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Bike").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Car").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Metro").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Car").use();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				super.run();
				FlyweightFactory.getInstance().factory("Metro").use();
			}
		}.start();
		
		FlyweightFactory.getInstance().print();
	}

}
