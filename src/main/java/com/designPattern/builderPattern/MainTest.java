package com.designPattern.builderPattern;

/***
 * 测试
 * 
 * @author liuzhihu
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		// 套餐A
		MealA a = new MealA();
		// 服务员准备套餐A
		waiter.setMealBuilder(a);
		// 获得套餐
		Meal mealA = waiter.singlePoint();

		System.out.println(mealA.toString());
	}
}
