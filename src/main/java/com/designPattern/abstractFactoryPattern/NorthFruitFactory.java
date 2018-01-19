package com.designPattern.abstractFactoryPattern;

public class NorthFruitFactory extends FruitFactory {

	@Override
	public Fruit getFruit(String type) {

		if ("Apple".equals(type)) {

			return new NorthApple();

		} else if ("Banana".equals(type)) {

			return new NorthBanana();

		} else {

			System.out.println("找不到对应的水果......");

			return null;
		}

	}

}
