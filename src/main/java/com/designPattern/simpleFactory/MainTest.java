package com.designPattern.simpleFactory;

/***
 * 简单工厂模式
 * 
 * @author liuzhihu
 *
 */
public class MainTest {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Fruit apple = FruitFactory.getFruit("Apple");

		apple.eatFruit();

		Fruit banana = FruitFactory.getFruit("Banana");

		banana.eatFruit();

	}

}
