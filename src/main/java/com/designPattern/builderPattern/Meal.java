package com.designPattern.builderPattern;

/***
 * 套餐
 * 
 * @author liuzhihu
 *
 */
public class Meal {

	private String food;

	private String drink;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {

		return "[Meal{food=" + this.food + ",drink=" + this.drink + "}]";
	}
}
