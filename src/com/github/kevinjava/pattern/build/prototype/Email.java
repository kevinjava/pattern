package com.github.kevinjava.pattern.build.prototype;


public class Email implements Cloneable{
	private String subject;
	private String content;
	private EmailAddress address;
	
	public Email(String subject, String content, EmailAddress address){
		this.subject = subject;
		this.content = content;
		this.address = address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public EmailAddress getAddress() {
		return address;
	}
	public void setAddress(EmailAddress address) {
		this.address = address;
	}
	public void print() {
		System.out.println(subject);
		System.out.println(content);
		address.print();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
