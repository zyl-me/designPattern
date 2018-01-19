package com.designPattern.prototypePattern;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Administrator
 *
 */
public class MainTest2 {

	public static void main(String[] args) {
		Person2 person1 = new Person2();

		person1.setId("001");
		person1.setName("wwe");

		String friend1 = "22";

		List<String> friends = new ArrayList<String>();

		friends.add(friend1);

		person1.setFriends(friends);

		Person2 person2 = person1.clone();

		System.out.println(person1.toString());

		System.out.println(person2.toString());
		String friend2 = "33";
		friends.add(friend2);
		person1.setFriends(friends);
		System.out.println(person1.getId() + "," + person1.getName() + "," + person1.getFriends());

		System.out.println(person2.getId() + "," + person2.getName() + "," + person2.getFriends());

	}

}
