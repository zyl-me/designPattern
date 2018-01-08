package com.designPattern.factoryMethod;

public class SouthBananaFactory extends FruitFactory {

	@Override
	public Fruit getFruit() {

		System.out.println("采摘南方香蕉");

		return new Banana();

	}
}
