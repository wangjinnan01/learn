package com.ujiuye.demos;

public class Demo07_×Ö·û´®Æ´½ÓÔ´Âë·ÖÎö {
	public static void main(String[] args) {
		test2();
	}

	private static void test2() {
		String str3 = "ab" + "c";//String str3 = "abc"
		System.out.println(str3.equals("abc"));
		System.out.println(str3 == "abc");
	}

	private static void test1() {
		String str1 = "ab";
		String str2 = "c";
		String str3 = str1 + str2;
		System.out.println(str3.equals("abc"));
		System.out.println(str3 == "abc");
	}
}
