package com.github.kevinjava.pattern.struct.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new ImageProxy();
		image.displayImage();

		Image image2 = (Image) Proxy.newInstance(new ImageImpl());
		image2.displayImage();
	}

	static class Proxy implements InvocationHandler {

		private Object obj;

		public static Object newInstance(Object object) {
			return java.lang.reflect.Proxy.newProxyInstance(object.getClass()
					.getClassLoader(), object.getClass().getInterfaces(),
					new Proxy(object));
		}

		private Proxy(Object obj) {
			this.obj = obj;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			System.out.println("before call");
			return method.invoke(obj, args);
		}

	}

}
