package com.github.kevinjava.pattern.behavior.visitor;

import java.util.ArrayList;

public class Guard implements Location {

	ArrayList<Location> locations = new ArrayList<>();

	public Guard() {
		locations.add(new Shool());
		locations.add(new Factory());
	}

	@Override
	public void accept(Visitor visitor) {
		for (Location location : locations) {
			location.accept(visitor);
		}
	}

}
