package com.designPattern.adapterPattern.classAdapter;

/***
 * 测试类适配器
 * 
 * @author liuzhihu
 *
 */
public class MainTest {

	public static void main(String[] args) {

		Animal animal = new DogAdapter();

		animal.isAnimal();
	}

}
