package com.github.kevinjava.pattern.behavior.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("输入表达式：");
			String expression = new BufferedReader(new InputStreamReader(
					System.in)).readLine();
			char[] ex = expression.toCharArray();
			HashMap<String, String> values = new HashMap<>();
			for (char c : ex) {
				if ((c != '+') && (c != '-')
						&& (values.get(String.valueOf(c)) == null)) {
					System.out.println("输入 " + c + "的值：");
					String value = new BufferedReader(new InputStreamReader(
							System.in)).readLine();
					values.put(String.valueOf(c), value);
				}
			}
			Calculator calculator = new Calculator(expression);
			calculator.getValue(values);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
