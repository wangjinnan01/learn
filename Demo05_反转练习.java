package com.ujiuye.demos;

public class Demo05_反转练习 {
	public static void main(String[] args) {
		System.out.println(reverse("abcd"));
	}
	
	/**
	 * 	定义一个方法，可以实现字符串的反转
		要求：使用StringBuilder，提升开发效率
	 */
	public static String reverse(String str) {
		return new StringBuffer(str).reverse().toString();
	}
}
