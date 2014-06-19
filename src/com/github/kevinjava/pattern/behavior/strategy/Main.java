package com.github.kevinjava.pattern.behavior.strategy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animation animation = new Animation();
		Interpolator linearInterpolator = new LinearInterpolator();
		Interpolator overshootInterpolator = new OvershootInterpolator();
		animation.setInterpolator(linearInterpolator);
		animation.doAction();
		animation.setInterpolator(overshootInterpolator);
		animation.doAction();
	}

}
