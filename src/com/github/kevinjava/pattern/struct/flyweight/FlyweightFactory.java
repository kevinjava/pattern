package com.github.kevinjava.pattern.struct.flyweight;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class FlyweightFactory {
	private HashMap<String, FlyWeight> flyWeights = new HashMap<>();
	private ReentrantLock lock = new ReentrantLock();

	private static class FlyweightFactoryHandler {
		static FlyweightFactory INSTANCE = new FlyweightFactory();
	}

	private FlyweightFactory() {

	}

	public static FlyweightFactory getInstance() {
		return FlyweightFactoryHandler.INSTANCE;
	}

	public FlyWeight factory(String type) {
		lock.lock();
		FlyWeight flyWeight = flyWeights.get(type);
		if (flyWeight == null) {
			try {
				Class<?> c = Class
						.forName("com.github.kevinjava.pattern.struct.flyweight."
								+ type);
				flyWeight = (FlyWeight) c.newInstance();
				flyWeights.put(type, flyWeight);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		lock.unlock();
		return flyWeight;
	}
	
	public void print(){
		System.out.println("pool size :" + flyWeights.size());
	}
}
