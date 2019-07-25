package com.ujiuye.demos;

public class Demo03_jvm默认处理异常的方式 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
		test3();
	}

	private static void test3() {
		int i = 1 / 0;
	}
}
