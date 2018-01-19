package com.designPattern.singletonPattern;

/***
 * ����ʽ����
 * @author Administrator
 *
 */
public class MainTest2 {

	public static void main(String[] args) {
		Person2 person = Person2.getPerson();
		Person2 person2 = Person2.getPerson();
		System.out.println(person == person2);

	}

}
