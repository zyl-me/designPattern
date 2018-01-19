package com.designPattern.builderPattern;

/***
 * 套餐A
 * 
 * @author liuzhihu
 *
 */
public class MealA implements MealBuilder {

	@Override
	public void buildFood() {

		meal.setDrink("一杯可乐");

	}

	@Override
	public void buildDrink() {

		meal.setFood("一盒薯条");

	}

}
