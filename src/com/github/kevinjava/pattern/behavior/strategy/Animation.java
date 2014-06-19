package com.github.kevinjava.pattern.behavior.strategy;

public class Animation {
	Interpolator interpolator;

	void setInterpolator(Interpolator interpolator) {
		this.interpolator = interpolator;
	}

	void doAction() {
		interpolator.getInterpolation(1.0f);
	}
}
