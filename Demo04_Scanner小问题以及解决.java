package com.ujiuye.demos;

import java.util.Scanner;

public class Demo04_Scanner小问题以及解决 {
	public static void main(String[] args) {
		test6_最终解决方式();
	}

	private static void test6_最终解决方式() {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		System.out.println(x + 1);
	}

	private static void test5_创建两个Scanner对象() {
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		System.out.println(x);
		
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.nextLine();
		System.out.println(line);
	}

	private static void test4_连续调用两次nextLine() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		
		sc.nextLine();
		
		String line = sc.nextLine();
		System.out.println(line);
	}

	private static void test3_连续录入两次nextLine不会出现问题() {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		System.out.println(line1);
		String line2 = sc.nextLine();
		System.out.println(line2);
	}

	private static void test2_连续录入两次int不会出问题() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		int y = sc.nextInt();
		System.out.println(y);
	}

	private static void test1_小问题演示() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		String line = sc.nextLine();
		System.out.println(line + "...");
	}
}
