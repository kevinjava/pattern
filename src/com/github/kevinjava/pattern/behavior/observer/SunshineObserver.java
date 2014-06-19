package com.github.kevinjava.pattern.behavior.observer;

public class SunshineObserver implements Observer {

	@Override
	public void update() {
		System.out.println("Sunshine Observer got the update notification");
	}

}
