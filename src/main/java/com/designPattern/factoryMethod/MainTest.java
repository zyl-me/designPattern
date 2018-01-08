package com.designPattern.factoryMethod;

/***
 * 工厂方法模式
 * 
 * @author liuzhihu
 *
 */
public class MainTest {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		NorthAppleFactory northFruitFactory = new NorthAppleFactory();
		SouthAppleFactory southFruitFactory = new SouthAppleFactory();

		Fruit northApple = northFruitFactory.getFruit("Apple");

		northApple.eatFruit();

		Fruit southApple = southFruitFactory.getFruit("Apple");

		southApple.eatFruit();

	}

}
