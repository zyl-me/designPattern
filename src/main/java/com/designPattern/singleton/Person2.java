package com.designPattern.singleton;

/***
 * 懒汉式单例模式
 * 
 * @author Administrator
 *
 */
public class Person2 {

	private static Person2 person2;

	private Person2() {

	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Person2 getPerson() {

		if (person2 == null) {

			person2 = new Person2();
		}

		return person2;
	}
}
