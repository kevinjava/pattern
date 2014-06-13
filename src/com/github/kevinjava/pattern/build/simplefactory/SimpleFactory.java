package com.github.kevinjava.pattern.build.simplefactory;

import com.github.kevinjava.pattern.build.abstractfactory.DemoUserHandler;
import com.github.kevinjava.pattern.build.abstractfactory.RegisterUserHandler;
import com.github.kevinjava.pattern.build.abstractfactory.UserHandler;

/**
 *  android ThreadFactory
 * @author kevliu
 *
 */
public class SimpleFactory {
	public UserHandler getUserHandler(int type) {
		if (type == 0) {
			return new RegisterUserHandler();
		} else {
			return new DemoUserHandler();
		}

	}
}
