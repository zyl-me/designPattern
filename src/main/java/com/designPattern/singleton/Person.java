package com.designPattern.singleton;

/***
 * ¶öººÊ½java
 * 
 * @author Administrator
 *
 */
public class Person {
	private static final Person person = new Person();

	private Person() {

	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Person getPerson() {

		return person;
	}

}
