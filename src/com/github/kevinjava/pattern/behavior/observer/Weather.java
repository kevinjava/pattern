package com.github.kevinjava.pattern.behavior.observer;

import java.util.ArrayList;

public class Weather implements Observable {
	ArrayList<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
