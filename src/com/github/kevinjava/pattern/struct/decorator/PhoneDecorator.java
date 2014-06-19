package com.github.kevinjava.pattern.struct.decorator;

public abstract class PhoneDecorator implements Phone{
	public Phone phone;
	
	public void setPhone(Phone phone){
		this.phone = phone;
	}
	
	@Override
	public void phoneDesc() {
		if(phone != null){
			phone.phoneDesc();
		}
	}
}
