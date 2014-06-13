package com.github.kevinjava.pattern.struct.adapter;

public class BaseAdapter implements ListAdapter {
	
	private String[] sourceData;
	
	public BaseAdapter(String[] sourceData) {
		this.sourceData = sourceData;
	}
	
	@Override
	public void getView() {
		// covert source data to view
		for (String str : sourceData) {
			System.out.println("create view by sourcedata :" + str);
		}
	}

}
