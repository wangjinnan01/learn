package com.ujiuye.demos;

public class Demo07_字符串的判断功能 {
	public static void main(String[] args) {
		
	}

	private static void test5_isEmpty() {
		System.out.println("abc".isEmpty());
		System.out.println("".isEmpty());
	}

	private static void test4_判断开头和结尾() {
		String str = "abcdxyz";
		System.out.println(str.startsWith("abc"));
		System.out.println(str.startsWith("abf"));
		
		System.out.println(str.endsWith("xyz"));
		System.out.println(str.endsWith(".java"));
	}

	private static void test3_contains() {
		System.out.println("abcdxyz".contains("abz"));
		System.out.println("abcdxyz".contains("ab"));
	}

	private static void test2_equalsIgnoreCase() {
		System.out.println("abcdEFG".equalsIgnoreCase("ABcdefG"));
	}

	private static void test1_equals() {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "xyz";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
