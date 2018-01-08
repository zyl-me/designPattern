package com.designPattern.factoryMethod;

public class NorthBananaFactory extends FruitFactory {

	@Override
	public Fruit getFruit() {

		System.out.println("采摘北方香蕉");

		return new Banana();

	}
}

