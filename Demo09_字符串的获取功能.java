package com.ujiuye.demos;

import java.util.Scanner;

public class Demo09_字符串的获取功能 {
	public static void main(String[] args) {
		
	}

	private static void test5_lastIndexOf() {
		String str = "abcd_mnp_abcd";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf('a', 8));
		System.out.println(str.lastIndexOf("abc"));
		System.out.println(str.lastIndexOf("abc", 8));
	}

	private static void test4_indexOf() {
		String str = "abcd_abcd_abcd";
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf(97));
		
		System.out.println(str.indexOf('a', 2));
		
		System.out.println(str.indexOf("bcd"));
		System.out.println(str.indexOf("bcd", 3));
	}

	private static void test3_获取字串() {
		String str = "abcdefg";
		String result = str.substring(2);
		System.out.println(str);
		System.out.println(result);
		
		String result2 = str.substring(3, 6);
		System.out.println(result2);
	}

	private static void test2_length() {
		System.out.println("abcdefg".length());
		//键盘录入一个字符串，获取打印每个字符
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			System.out.println(ch);
		}
	}

	private static void test1_charAt() {
		String str = "bcadeafg";
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(-1));
		System.out.println(str.charAt(8));
	}
}
