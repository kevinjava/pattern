package com.github.kevinjava.pattern.behavior.observer;

public class StormObserver implements Observer {

	@Override
	public void update() {
		System.out.println("Store Observer got the update notification");
	}

}
