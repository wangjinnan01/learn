package com.ujiuye.demos;

import java.util.Scanner;

public class Demo04_�����쳣�ĵ�һ�ָ�ʽ {
	public static void main(String[] args) {
		try {
			int n = new Scanner(System.in).nextInt();
			int i = 1 / n;
			System.out.println(i);
		} catch (ArithmeticException ae) {
			System.out.println("����ʹ��0��Ϊ�����������������г���");
		}
		
		System.out.println("��ӭ�´ι���");
	}
}
