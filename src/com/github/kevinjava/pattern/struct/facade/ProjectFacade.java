package com.github.kevinjava.pattern.struct.facade;

public class ProjectFacade {

	public void developApp(){
		new Manager().init();
		new UI().designApp();
		new Developer().code();
	}
}
