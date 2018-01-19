package com.designPattern.singletonPattern;

/***
 * ����ʽ����
 * @author Administrator
 *
 */
public class MainTest1 {

	public static void main(String[] args) {
		Person person1 = Person.getPerson();
		Person person2 = Person.getPerson();
		System.out.println(person1 == person2);

	}

}
