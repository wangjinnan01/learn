package com.ujiuye.demos;

public class Demo06_String构造方法 {
	public static void main(String[] args) {
		test4_字符数组转字符串();
	}

	private static void test4_字符数组转字符串() {
		char[] chs = {'a', 'x', 'y', 'z'};
		String str1 = new String(chs);
		System.out.println(str1);
		String str2 = new String(chs, 1, 2);
		System.out.println(str2);
	}

	private static void test3_字节数组转字符串() {
		byte[] arr = {100, 99, 98, 97};
		String str1 = new String(arr);
		System.out.println(str1);
		
		String str2 = new String(arr, 1, 2);
		System.out.println(str2);
	}

	private static void test2_字符串副本() {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}

	private static void test1_空参构造() {
		String str = new String();
		System.out.println(str);
	}
}
