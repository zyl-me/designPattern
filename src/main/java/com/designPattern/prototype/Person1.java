package com.designPattern.prototype;

public class Person1 implements Cloneable {

	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/***
	 * 浅度克隆
	 */
	public Person1 clone() {

		try {
			return (Person1) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

			return null;
		}
	}

}
