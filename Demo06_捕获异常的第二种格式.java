package com.ujiuye.demos;

import java.util.Scanner;

public class Demo06_�����쳣�ĵڶ��ָ�ʽ {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println(result);
			
			int index = sc.nextInt();
			int[] arr = {2,4,6};
			System.out.println(arr[index]);
		} catch (ArithmeticException ae) {
			System.out.println("�����������쳣������Ϊ0��");
		} finally {
			System.out.println("����Ҫִ�е�һ�д���");
		}
		
	}

}
