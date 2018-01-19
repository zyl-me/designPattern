package com.designPattern.builderPattern;

/***
 * 套餐B
 * 
 * @author liuzhihu
 *
 */
public class MealB implements MealBuilder {

	@Override
	public void buildFood() {

		meal.setDrink("一杯橙汁");

	}

	@Override
	public void buildDrink() {

		meal.setFood("一份鸡腿");

	}

}
