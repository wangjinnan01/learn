package com.ujiuye.demos;

import java.util.Scanner;

public class Demo04_捕获异常的第一种格式 {
	public static void main(String[] args) {
		try {
			int n = new Scanner(System.in).nextInt();
			int i = 1 / n;
			System.out.println(i);
		} catch (ArithmeticException ae) {
			System.out.println("不能使用0作为除数，建议重新运行程序");
		}
		
		System.out.println("欢迎下次光临");
	}
}
