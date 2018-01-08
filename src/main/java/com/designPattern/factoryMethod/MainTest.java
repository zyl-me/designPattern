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

		AppleFactory northAppleFactory = new AppleFactory();

		Fruit northApple = northAppleFactory.getFruit();

		northApple.eatFruit();

		BananaFactory northBananaFactory = new BananaFactory();

		Fruit northBanana = northBananaFactory.getFruit();
		northBanana.eatFruit();

	}

}
