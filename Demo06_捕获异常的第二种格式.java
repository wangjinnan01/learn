package com.ujiuye.demos;

import java.util.Scanner;

public class Demo06_捕获异常的第二种格式 {

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
			System.out.println("出现了算数异常，除数为0了");
		} finally {
			System.out.println("必须要执行的一行代码");
		}
		
	}

}
