package com.designPattern.simpleFactory;

public class FruitFactory {

	/***
	 * 采集方法
	 * 
	 * @param type
	 * @return
	 */
	public static Fruit getFruit(String type) {

		if ("Apple".equals(type)) {

			return new Apple();

		} else if ("Banana".equals(type)) {

			return new Banana();

		} else {

			System.out.println("找不到对应的水果......");

			return null;
		}

	}

}
