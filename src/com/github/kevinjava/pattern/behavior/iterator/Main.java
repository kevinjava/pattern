package com.github.kevinjava.pattern.behavior.iterator;

public class Main {
	public static void main(String[] args) {
		TV tv = new SharpTv();
		Iterator iterator = tv.getIterator();
		while (!iterator.isLast()) {
			System.out.println(iterator.next().getName());
		}
	}
}
