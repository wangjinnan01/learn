package com.ujiuye.demos;

public class Demo06_String���췽�� {
	public static void main(String[] args) {
		test4_�ַ�����ת�ַ���();
	}

	private static void test4_�ַ�����ת�ַ���() {
		char[] chs = {'a', 'x', 'y', 'z'};
		String str1 = new String(chs);
		System.out.println(str1);
		String str2 = new String(chs, 1, 2);
		System.out.println(str2);
	}

	private static void test3_�ֽ�����ת�ַ���() {
		byte[] arr = {100, 99, 98, 97};
		String str1 = new String(arr);
		System.out.println(str1);
		
		String str2 = new String(arr, 1, 2);
		System.out.println(str2);
	}

	private static void test2_�ַ�������() {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}

	private static void test1_�ղι���() {
		String str = new String();
		System.out.println(str);
	}
}
