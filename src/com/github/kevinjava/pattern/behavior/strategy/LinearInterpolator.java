package com.github.kevinjava.pattern.behavior.strategy;

public class LinearInterpolator implements Interpolator {

	@Override
	public void getInterpolation(float input) {
		System.out.println("use LinearInterpolator");
	}

}
