package com.designPattern.builderPattern;

/***
 * 制作套餐
 * 
 * @author liuzhihu
 *
 */
public interface MealBuilder {

	Meal meal = new Meal();

	public abstract void buildFood();

	public abstract void buildDrink();

}
