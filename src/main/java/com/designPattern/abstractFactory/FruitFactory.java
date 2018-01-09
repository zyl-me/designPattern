package com.designPattern.abstractFactory;

public abstract class FruitFactory {

	/***
	 * 采集水果
	 * 
	 * @param type
	 * @return
	 */
	public abstract Fruit getFruit(String type);

}
