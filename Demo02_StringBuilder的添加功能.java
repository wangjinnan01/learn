package com.ujiuye.demos;

public class Demo02_StringBuilder的添加功能 {
	public static void main(String[] args) {
		test2_insert();
	}

	private static void test2_insert() {
		StringBuilder sb = new StringBuilder();
		sb.insert(0, "abc");
		System.out.println(sb);
		sb.insert(3, 888);
		System.out.println(sb);
		sb.insert(2, false);
		System.out.println(sb);
	}

	private static void test1_append() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(666);
		sb1.append(false);
		sb1.append("abc");
		sb1.append(97);
		System.out.println(sb1);
	}
}
