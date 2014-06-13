package com.github.kevinjava.pattern.struct.bridge;

/**
 * 桥接，策略不同在与：
 * 桥接是双向变化，定义抽象使用implementer的方法，结构式
 * 策略是单向变化，行为式
 * @author kevliu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tudi tudi1 = new Wukong();
		tudi1.setWuqi(new JinGuBang());
		tudi1.useWuqi();
		
		Tudi tudi2 = new Bajie();
		tudi2.setWuqi(new DingPa());
		tudi2.useWuqi();
	}

}
