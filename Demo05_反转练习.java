package com.ujiuye.demos;

public class Demo05_��ת��ϰ {
	public static void main(String[] args) {
		System.out.println(reverse("abcd"));
	}
	
	/**
	 * 	����һ������������ʵ���ַ����ķ�ת
		Ҫ��ʹ��StringBuilder����������Ч��
	 */
	public static String reverse(String str) {
		return new StringBuffer(str).reverse().toString();
	}
}
