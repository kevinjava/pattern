package com.github.kevinjava.pattern.build.singleton;

/**
 * android system managers
 * @author kevliu
 *
 */
public class Singleton {
	private static class SingletonHandler {
		static Singleton INSTANCE = new Singleton();
	}

	private Singleton() {

	}

	public static Singleton getInstance() {
		return SingletonHandler.INSTANCE;
	}
}
