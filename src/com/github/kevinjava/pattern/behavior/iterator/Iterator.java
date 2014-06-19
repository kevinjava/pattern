package com.github.kevinjava.pattern.behavior.iterator;

public interface Iterator {
	Item next();
	Item first();
	boolean isLast();
}
