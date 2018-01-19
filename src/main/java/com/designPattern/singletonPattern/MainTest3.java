package com.designPattern.singletonPattern;

/***
 * ����ʽ����
 * 
 * @author Administrator
 *
 */
public class MainTest3 {

	public static void main(String[] args) {
		Person3 person = Person3.getPerson();
		Person3 person2 = Person3.getPerson();
		System.out.println(person == person2);

	}

}
