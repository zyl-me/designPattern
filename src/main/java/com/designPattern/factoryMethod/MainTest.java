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

		AppleFactory appleFactory = new AppleFactory();

		Fruit apple = appleFactory.getFruit();

		apple.eatFruit();

		BananaFactory bananaFactory = new BananaFactory();

		Fruit banana = bananaFactory.getFruit();

		banana.eatFruit();

	}

}
