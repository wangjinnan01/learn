package com.ujiuye.demos;

import java.util.Scanner;

public class Demo03_ScannerÂ¼Èë×Ö·û´® {
	public static void main(String[] args) {
//		test1_next();
//		test2_nextInt();
//		test3_nextLine();
	}

	private static void test3_nextLine() {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		System.out.println(line1 + "..." + line2);
	}

	private static void test2_nextInt() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x + y);
	}

	private static void test1_next() {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println(str1);
		String str2 = sc.next();
		System.out.println(str2);
	}
}
