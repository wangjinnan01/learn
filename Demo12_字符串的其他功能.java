package com.ujiuye.demos;

public class Demo12_�ַ������������� {
	public static void main(String[] args) {
		test2_ȥ���ո�();
		
	}

	private static void test2_ȥ���ո�() {
		String str1 = "  a b	c\t";
		System.out.println(str1);
		System.out.println(str1.trim());
	}

	private static void test1_�滻() {
		String str1 = "abcdxyxyxxdcba";
		System.out.println(str1.replace("xy", "qq"));
		System.out.println(str1.replace("x", "").replace("y", ""));
	}
}
