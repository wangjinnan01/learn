package com.ujiuye.demos;

import java.util.Arrays;

public class Demo10_字符串的转换功能 {
	public static void main(String[] args) {
		test3_valueOf();
	}

	private static void test3_valueOf() {
		System.out.println(String.valueOf(97) + 1);
		System.out.println(String.valueOf(12.34) + 1);
		System.out.println(String.valueOf(new Person("zhangsan", 23)));
	}

	private static void test2_大小写() {
		System.out.println("abCdefG".toUpperCase());
		System.out.println("abCdefG".toLowerCase());
		
		String str = "abcdefg";
		String result = str.toUpperCase();
		System.out.println(str);
		System.out.println(result);
	}

	private static void test1_转字节数组或者字符数组() {
		byte[] bytes = "abcd".getBytes();
		System.out.println(bytes);
		System.out.println(Arrays.toString(bytes));
		
		char[] chs = "abcdef".toCharArray();
		System.out.println(chs);
		System.out.println(Arrays.toString(chs));
	}
}
