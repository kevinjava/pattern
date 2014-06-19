package com.github.kevinjava.pattern.behavior.memento;

public class Role {
	int blood;
	int gamepoint;
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
	
	
	public Memento createMemento(){
		return new Memento(blood, gamepoint);
	}
	
	public void restoreMemento(Memento memento){
		blood = memento.getBlood();
		gamepoint = memento.getGamepoint();
	}
	
	public void print() {
		System.out.println("blold is :" + blood);
		System.out.println("gamepoint is :" + gamepoint);
	}
}
