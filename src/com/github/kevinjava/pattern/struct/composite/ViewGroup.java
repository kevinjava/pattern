package com.github.kevinjava.pattern.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends View {
	List<View> views = new ArrayList<>();

	public void addView(View view) {
		views.add(view);
	}

	public void removeView(View view) {
		views.remove(view);
	}

	public View getClild(int index) {
		return views.get(index);
	}
}
