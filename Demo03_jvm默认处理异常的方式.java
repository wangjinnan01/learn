package com.ujiuye.demos;

public class Demo03_jvmĬ�ϴ����쳣�ķ�ʽ {
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
