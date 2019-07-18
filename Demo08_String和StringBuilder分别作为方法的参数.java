package com.ujiuye.demos;

public class Demo08_String和StringBuilder分别作为方法的参数 {
	public static void main(String[] args) {
		test3_StringBuilder作为方法的参数修改对象中的数据();
	}

	private static void test3_StringBuilder作为方法的参数修改对象中的数据() {
		StringBuilder sb = new StringBuilder("abc");
		change2(sb);
		System.out.println(sb);
	}

	private static void change2(StringBuilder sb) {
		sb.replace(0, sb.length(), "xyz");
		System.out.println(sb);
	}

	private static void test21_StringBuilder作为方法的参数修改局部变量() {
		StringBuilder sb = new StringBuilder("abc");
		change(sb);
		System.out.println(sb);
	}
	
	public static void change(StringBuilder sb) {
		sb = new StringBuilder("xyz");
		System.out.println(sb);
	}

	private static void test1_String作为方法的参数不改变原值() {
		String str = "abc";
		change(str);
		System.out.println(str);
	}

	private static void change(String str) {
		str = "xyz";
		System.out.println(str);
	}
}
