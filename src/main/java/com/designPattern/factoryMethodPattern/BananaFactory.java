package com.designPattern.factoryMethodPattern;

public class BananaFactory extends FruitFactory {

	@Override
	public Fruit getFruit() {

		System.out.println("采摘香蕉");

		return new Banana();

	}
}

