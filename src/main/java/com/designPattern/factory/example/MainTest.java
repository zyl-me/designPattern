package com.designPattern.factory.example;

import java.util.Scanner;

public class MainTest {

	// ���ģʽ д������
	public static void main(String[] args) {
		// 1�����ܿ���̨����
		System.out.println("--�������������--");
		System.out.println("--�����һ������--");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();

		System.out.println("--���������--");
		String oper = scanner.nextLine();

		System.out.println("--����ڶ�������--");
		String strNum2 = scanner.nextLine();
		// ��������
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
			// ��覴ã�δ�����޸�
			doubleResult = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
		}

		System.out.println(doubleResult);
	}

}
