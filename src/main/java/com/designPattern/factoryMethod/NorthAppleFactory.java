package com.designPattern.factoryMethod;

public class NorthAppleFactory extends FruitFactory {

	@Override
	public Fruit getFruit() {

		System.out.println("采摘北方苹果");

		return new Apple();

	}
}

