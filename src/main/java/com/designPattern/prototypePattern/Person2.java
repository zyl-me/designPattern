package com.designPattern.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Person2 implements Cloneable {

	private String id;

	private String name;

	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

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

	/**
	 * 深度克隆
	 */
	public Person2 clone() {

		try {

			Person2 person = (Person2) super.clone();

			List<String> newFriends = new ArrayList<String>();

			for (String friend : this.getFriends()) {
				newFriends.add(friend);
			}

			person.setFriends(newFriends);

			return person;

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();

			return null;
		}
	}

}
