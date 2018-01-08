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

		NorthAppleFactory northAppleFactory = new NorthAppleFactory();
		SouthAppleFactory southAppleFactory = new SouthAppleFactory();

		Fruit northApple = northAppleFactory.getFruit();

		northApple.eatFruit();

		Fruit southApple = southAppleFactory.getFruit();

		southApple.eatFruit();

		NorthBananaFactory northBananaFactory = new NorthBananaFactory();
		SouthBananaFactory southBananaFactory = new SouthBananaFactory();

		Fruit northBanana = northBananaFactory.getFruit();
		northBanana.eatFruit();

		Fruit southBanana = southBananaFactory.getFruit();

		southBanana.eatFruit();

	}

}
