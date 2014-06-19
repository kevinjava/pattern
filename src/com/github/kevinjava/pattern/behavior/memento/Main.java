package com.github.kevinjava.pattern.behavior.memento;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Role role = new Role();
		Caretaker taker = new Caretaker();
		role.setBlood(100);
		role.setGamepoint(0);
		role.print();
		taker.setMemento(role.createMemento());
		role.setBlood(50);
		role.setGamepoint(20);
		role.print();
		role.restoreMemento(taker.getMemento());
		role.print();
	}

}
