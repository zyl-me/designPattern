package com.designPattern.abstractFactory;

public class SouthFruitFactory extends FruitFactory {

	@Override
	public Fruit getFruit(String type) {

		if ("Apple".equals(type)) {

			return new SouthApple();

		} else if ("Banana".equals(type)) {

			return new SouthBanana();

		} else {

			System.out.println("找不到对应的水果......");

			return null;
		}

	}

}
