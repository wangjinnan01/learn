package com.ujiuye.demos;

public class Demo02_正则表达式的字符类型 {
	public static void main(String[] args) {
		String regex = "[abcda-zMNPA-Z]";
		System.out.println("6".matches(regex));
		System.out.println("6".matches("[abcda-zMNPA-Z6]"));

	}

	private static void test2() {
		System.out.println("".matches("[^abc]"));
		System.out.println("a".matches("[^abcde]"));
		System.out.println("#".matches("[^abcde]"));
	}

	private static void test1() {
		System.out.println("a".matches("[aabcd]"));
		System.out.println("ab".matches("[ababc]"));
		System.out.println("ab".matches("[ababc]b"));
		System.out.println("a".matches("[ababc]b"));
		System.out.println("".matches("[abcda]"));
	}
}
