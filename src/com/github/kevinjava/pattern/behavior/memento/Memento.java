package com.github.kevinjava.pattern.behavior.memento;

public class Memento {
	int blood;
	int gamepoint;
	
	
	public Memento(int blood2, int gamepoint2) {
		this.blood = blood2;
		this.gamepoint = gamepoint2;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getGamepoint() {
		return gamepoint;
	}
	public void setGamepoint(int gamepoint) {
		this.gamepoint = gamepoint;
	}
	
}
