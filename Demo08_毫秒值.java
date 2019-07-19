package com.ujiuye.demos;

public class Demo08_毫秒值 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		test2_testStringBuilder();
		long end = System.currentTimeMillis();
		System.out.println("程序运行时间为：" + (end - start));
	}

	private static void test2_testStringBuilder() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 99999; i++) {
			sb.append(i);
		}
		String str = sb.toString();
	}

	private static void test1_testString() {
		String str = "";
		for (int i = 1; i <= 99999; i++) {
			str += i;
		}
	}
}
