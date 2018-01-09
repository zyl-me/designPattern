package com.designPattern.factoryMethod;

public class AppleFactory extends FruitFactory {

	@Override
	public Fruit getFruit() {

		System.out.println("采摘苹果");

		return new Apple();

	}
}

