package com.github.kevinjava.pattern.build.builder;

public class DialogBuilder {
	String title;
	String contentView;
	String buttons;
	public DialogBuilder setTitle(){
		title = "has dialog title";
		return this;
	}
	
	public DialogBuilder setContentView(){
		contentView = "has Content View";
		return this;
	}

	public DialogBuilder setButtons(){
		buttons = "has click Buttons";
		return this;
	}
	
	public void print(){
		System.out.println(title);
		System.out.println(contentView);
		System.out.println(buttons);
	}
}
