package com.designPattern.abstractFactoryPattern;

public class MainTest {

	public static void main(String[] args) {

		// 北方水果
		NorthFruitFactory northFruitFactory = new NorthFruitFactory();

		Fruit northApple = northFruitFactory.getFruit("Apple");

		northApple.eatFruit();

		Fruit northBanana = northFruitFactory.getFruit("Banana");

		northBanana.eatFruit();

		// 南方水果
		SouthFruitFactory southFruitFactory = new SouthFruitFactory();

		Fruit southApple = southFruitFactory.getFruit("Apple");

		southApple.eatFruit();

		Fruit southBanana = southFruitFactory.getFruit("Banana");

		southBanana.eatFruit();

	}

}
