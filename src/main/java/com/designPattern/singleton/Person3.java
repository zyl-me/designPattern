package com.designPattern.singleton;

/***
 * Ë«ÖØ»úÖÆ
 * 
 * @author Administrator
 *
 */
public class Person3 {

	private static Person3 person3;

	private Person3() {

	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Person3 getPerson() {

		if (person3 == null) {

			synchronized (Person3.class) {

				if (person3 == null) {
					person3 = new Person3();
				}

			}

		}

		return person3;
	}

}
