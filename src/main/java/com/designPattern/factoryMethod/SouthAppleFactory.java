package com.designPattern.factoryMethod;

public class SouthAppleFactory extends FruitFactory {

	@Override
	public Fruit getFruit() {

		System.out.println("采摘南方苹果");

		return new Apple();

	}
}
