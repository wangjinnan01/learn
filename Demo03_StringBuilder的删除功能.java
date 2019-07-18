package com.ujiuye.demos;

public class Demo03_StringBuilderµÄÉ¾³ý¹¦ÄÜ {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefg");
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		sb.delete(0, 4);
		System.out.println(sb);
	}

}
