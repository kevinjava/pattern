package com.github.kevinjava.pattern.struct.proxy;

public class ImageProxy implements Image {
	private ImageImpl imageImpl;

	@Override
	public void displayImage() {
		if (imageImpl == null) {
			imageImpl = new ImageImpl();
		}
		imageImpl.displayImage();
	}

}
