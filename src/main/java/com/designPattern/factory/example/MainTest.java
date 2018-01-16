package com.designPattern.factory.example;

import java.util.Scanner;

public class MainTest {

	// 设计模式 写计算器
	public static void main(String[] args) {
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
		double num1 = 0;
		double num2 = 0;

		if (("+").equals(oper)) {
			OperationFactory factory = new AddOperatioFactory();
			Operation operation = factory.getOperation();
			operation.setNum1(num1);
			operation.setNum2(num2);
			doubleResult = operation.getResult();

		} else if (("-").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
		} else if (("*").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
		} else if (("/").equals(oper)) {
			// 有瑕疵，未进行修改
			doubleResult = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
		}

		System.out.println(doubleResult);
	}

}
