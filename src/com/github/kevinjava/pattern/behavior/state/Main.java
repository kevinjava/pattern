package com.github.kevinjava.pattern.behavior.state;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VoteManager manager = new VoteManager();
		for (int i=0; i<=10;i++) {
			manager.vote("刘琼");
		}
		
		for (int i=0; i<10;i++) {
			manager.vote("张三");
		}
	}

}
