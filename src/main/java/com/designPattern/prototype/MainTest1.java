package com.designPattern.prototype;

/***
 * 
 * @author Administrator
 *
 */
public class MainTest1 {

	public static void main(String[] args) {
		Person1 person1 = new Person1();

		person1.setId("001");
		person1.setName("wew");

		Person1 person2 = person1.clone();

		System.out.println(person1.toString());

		System.out.println(person2.toString());
		person1.setName("lisi");
		System.out.println(person1.getId() + "," + person1.getName());

		System.out.println(person2.getId() + "," + person2.getName());

	}

}
