package com.ujiuye.demos;

import java.util.Scanner;

public class Demo05_�����쳣��һ�ָ�ʽ�����쳣 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("��¼��һ������");
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println("result = " + result);
			
			int[] arr = {1, 22, 888};
			System.out.println("��¼��Ҫ���ʵ�Ԫ�ص�����");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
			arr = null;
			System.out.println(arr.length);
		} catch (ArithmeticException ae) {
			System.out.println("0������Ϊ����");
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("����������쳣������������");
		}
		
		System.out.println("��ӭ�´ι���");
	}

	private static void test2_�����쳣���ϵĴ���() {
		/*try {
			Scanner sc = new Scanner(System.in);
			System.out.println("��¼��һ������");
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println("result = " + result);
			
			int[] arr = {1, 22, 888};
			System.out.println("��¼��Ҫ���ʵ�Ԫ�ص�����");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
			arr = null;
			System.out.println(arr.length);
		} catch (Exception ne) {
			System.out.println("null���ܵ����κ����Ժͷ���");
		} catch (ArithmeticException ae) {
			System.out.println("0������Ϊ����");
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("������������Χ");
		}*/
		
		
		System.out.println("��ӭ�´ι���");
	}

	private static void test1() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("��¼��һ������");
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println("result = " + result);
			
			int[] arr = {1, 22, 888};
			System.out.println("��¼��Ҫ���ʵ�Ԫ�ص�����");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
			arr = null;
			System.out.println(arr.length);
		} catch (ArithmeticException ae) {
			System.out.println("0������Ϊ����");
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("������������Χ");
		} catch (NullPointerException ne) {
			System.out.println("null���ܵ����κ����Ժͷ���");
		}
		
		
		System.out.println("��ӭ�´ι���");
	}
}
