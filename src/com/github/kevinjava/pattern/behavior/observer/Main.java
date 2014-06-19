package com.github.kevinjava.pattern.behavior.observer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observable observable = new Weather();
		observable.add(new StormObserver());
		observable.add(new SunshineObserver());
		observable.notifyObserver();
	}

}
