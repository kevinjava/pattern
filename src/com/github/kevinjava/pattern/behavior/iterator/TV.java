package com.github.kevinjava.pattern.behavior.iterator;

import java.util.ArrayList;

public interface TV {
	Iterator getIterator();

	ArrayList<Item> getChannel();
}
