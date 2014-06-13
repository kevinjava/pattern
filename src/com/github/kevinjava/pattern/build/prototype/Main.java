package com.github.kevinjava.pattern.build.prototype;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Email email = new Email("take a look of the bugs on redmine",
				"check out the bug 1, 2, 3, 4", new EmailAddress("KevinLiu", "liuqiong1987@gmail.com"));
		System.out.println("start to clone");
		try {
			Email newEmail = (Email) email.clone();
			newEmail.setContent("this is new email content");
			newEmail.getAddress().setName("KevinJava");
			newEmail.print();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		email.print();
		
		DeepClone clone = new DeepClone();
		System.out.println("deep clone started");
		try {
			DeepClone clone1 = (DeepClone) clone.clone();
			clone1.name[0] = "Liu";
			clone1.name[1] = "clone";
			clone1.print();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clone.print();
	}

}
