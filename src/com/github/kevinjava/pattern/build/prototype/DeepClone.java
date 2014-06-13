package com.github.kevinjava.pattern.build.prototype;

public class DeepClone implements Cloneable {
	
	public String[] name;
	
	public DeepClone(){
		name = new String[2];
		name[0] = "Kevin";
		name[1] = "Java";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepClone clone = (DeepClone) super.clone();
		clone.name = name.clone();
		return clone;
	}
	
	public void print(){
		System.out.println(name);
		System.out.println(name[0]);
		System.out.println(name[1]);
	}
}
