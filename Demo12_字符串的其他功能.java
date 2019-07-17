package com.ujiuye.demos;

public class Demo12_字符串的其他功能 {
	public static void main(String[] args) {
		test2_去掉空格();
		
	}

	private static void test2_去掉空格() {
		String str1 = "  a b	c\t";
		System.out.println(str1);
		System.out.println(str1.trim());
	}

	private static void test1_替换() {
		String str1 = "abcdxyxyxxdcba";
		System.out.println(str1.replace("xy", "qq"));
		System.out.println(str1.replace("x", "").replace("y", ""));
	}
}
