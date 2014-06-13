package com.github.kevinjava.pattern.struct.adapter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BaseAdapter(new String[]{"source1", "source2"}).getView();
	}

}
