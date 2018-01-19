package com.designPattern.builderPattern;

/***
 * 服务员总体调度
 * 
 * @author liuzhihu
 *
 */
public class Waiter {

	private MealBuilder mealBuilder;

	public void setMealBuilder(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	public Meal singlePoint() {
		// 下单一个饮料
		mealBuilder.buildDrink();

		// 下单一个食物
		mealBuilder.buildFood();

		return MealBuilder.meal;
	}

}
