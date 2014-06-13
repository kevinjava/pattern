package com.github.kevinjava.pattern.build.prototype;

public class EmailAddress implements Cloneable {
	private String name;
	private String address;
	
	public EmailAddress(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void print() {
		System.out.println("Email Address name : " + name);
		System.out.println("Email Address address : " + address);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
