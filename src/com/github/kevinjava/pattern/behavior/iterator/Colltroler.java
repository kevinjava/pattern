package com.github.kevinjava.pattern.behavior.iterator;

import java.util.ArrayList;

public class Colltroler implements Iterator {

	private ArrayList<Item> items;
	private int index = 0;

	public Colltroler(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public Item next() {
		Item i = items.get(index);
		index++;
		return i;
	}

	@Override
	public Item first() {
		return items.get(0);
	}

	@Override
	public boolean isLast() {
		return index == items.size();
	}

}
