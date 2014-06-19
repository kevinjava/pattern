package com.github.kevinjava.pattern.behavior.iterator;

import java.util.ArrayList;

public class SharpTv implements TV {
	ArrayList<Item> items = new ArrayList<>();
	
	public SharpTv() {
		items.add(new Item("Sharp"));
		items.add(new Item("panda"));
	}
	@Override
	public Iterator getIterator() {
		return new Colltroler(items);
	}

	@Override
	public ArrayList<Item> getChannel() {
		return items;
	}

}
