package com.github.kevinjava.pattern.struct.bridge;

public abstract class Tudi {

	Wuqi wuqi;
	private String name;

	public Tudi(String name) {
		this.name = name;
	};

	public void setWuqi(Wuqi wuqi) {
		this.wuqi = wuqi;
	}

	public void useWuqi() {
		System.out.println(name + " use " + wuqi.getWuqi());
	}
	
}
