package com.github.kevinjava.pattern.behavior.visitor;

public interface Location {

	void accept(Visitor visitor);
}
