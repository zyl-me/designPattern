package com.designPattern.factory.example;

import java.util.Scanner;

/***
 * ��������������
 * 
 * @author Administrator
 *
 */
public class MainTest1 {

	// ��ͨ�ļ�������δʹ�����ģʽ
	public static void main(String[] args) throws Exception {
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
		if (("+").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) + Double.parseDouble(strNum2);
		} else if (("-").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
		} else if (("*").equals(oper)) {
			doubleResult = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
		} else if (("/").equals(oper)) {
			// ��覴ã�δ�����޸�
			doubleResult = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
		}
		// ������
		System.out.println(doubleResult);
	}

}
