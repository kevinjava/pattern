package com.github.kevinjava.pattern.build.builder;

public class Main {

	public static void main(String[] args) {
		new DialogBuilder().setTitle().setContentView().setButtons().print();
	}

}
