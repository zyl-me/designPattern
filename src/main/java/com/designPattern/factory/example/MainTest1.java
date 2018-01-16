package com.designPattern.factory.example;

import java.util.Scanner;

/***
 * 制作四则运算器
 * 
 * @author Administrator
 *
 */
public class MainTest1 {

	// 普通的计算器，未使用设计模式
	public static void main(String[] args) throws Exception {
		// 1、接受控制台输入
		System.out.println("--四则运算计算器--");
		System.out.println("--输入第一个参数--");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();

		System.out.println("--输入运算符--");
		String oper = scanner.nextLine();

		System.out.println("--输入第二个参数--");
		String strNum2 = scanner.nextLine();
		// 进行运算
		double doubleResult = 0;
		if (("+").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) + Double.parseDouble(strNum2);
		} else if (("-").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
		} else if (("*").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
		} else if (("/").equals(oper)) {
			// 有瑕疵，未进行修改
			doubleResult = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
		}
		// 输出结果
		System.out.println(doubleResult);
	}

}
