package com.ujiuye.demos;

public class Demo08_String��StringBuilder�ֱ���Ϊ�����Ĳ��� {
	public static void main(String[] args) {
		test3_StringBuilder��Ϊ�����Ĳ����޸Ķ����е�����();
	}

	private static void test3_StringBuilder��Ϊ�����Ĳ����޸Ķ����е�����() {
		StringBuilder sb = new StringBuilder("abc");
		change2(sb);
		System.out.println(sb);
	}

	private static void change2(StringBuilder sb) {
		sb.replace(0, sb.length(), "xyz");
		System.out.println(sb);
	}

	private static void test21_StringBuilder��Ϊ�����Ĳ����޸ľֲ�����() {
		StringBuilder sb = new StringBuilder("abc");
		change(sb);
		System.out.println(sb);
	}
	
	public static void change(StringBuilder sb) {
		sb = new StringBuilder("xyz");
		System.out.println(sb);
	}

	private static void test1_String��Ϊ�����Ĳ������ı�ԭֵ() {
		String str = "abc";
		change(str);
		System.out.println(str);
	}

	private static void change(String str) {
		str = "xyz";
		System.out.println(str);
	}
}
