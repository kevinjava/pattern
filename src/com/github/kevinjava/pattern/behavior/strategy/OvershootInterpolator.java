package com.github.kevinjava.pattern.behavior.strategy;

public class OvershootInterpolator implements Interpolator {

	@Override
	public void getInterpolation(float input) {
		System.out.println("use OvershootInterpolator");
	}

}
