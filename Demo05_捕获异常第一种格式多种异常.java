package com.ujiuye.demos;

import java.util.Scanner;

public class Demo05_捕获异常第一种格式多种异常 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请录入一个除数");
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println("result = " + result);
			
			int[] arr = {1, 22, 888};
			System.out.println("请录入要访问的元素的索引");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
			arr = null;
			System.out.println(arr.length);
		} catch (ArithmeticException ae) {
			System.out.println("0不能作为除数");
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("数组出现了异常，请重新运行");
		}
		
		System.out.println("欢迎下次光临");
	}

	private static void test2_父类异常在上的错误() {
		/*try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请录入一个除数");
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println("result = " + result);
			
			int[] arr = {1, 22, 888};
			System.out.println("请录入要访问的元素的索引");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
			arr = null;
			System.out.println(arr.length);
		} catch (Exception ne) {
			System.out.println("null不能调用任何属性和方法");
		} catch (ArithmeticException ae) {
			System.out.println("0不能作为除数");
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("超出了索引范围");
		}*/
		
		
		System.out.println("欢迎下次光临");
	}

	private static void test1() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请录入一个除数");
			int n = sc.nextInt();
			int result = 10 / n;
			System.out.println("result = " + result);
			
			int[] arr = {1, 22, 888};
			System.out.println("请录入要访问的元素的索引");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
			arr = null;
			System.out.println(arr.length);
		} catch (ArithmeticException ae) {
			System.out.println("0不能作为除数");
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("超出了索引范围");
		} catch (NullPointerException ne) {
			System.out.println("null不能调用任何属性和方法");
		}
		
		
		System.out.println("欢迎下次光临");
	}
}
