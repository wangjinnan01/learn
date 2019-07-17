package com.ujiuye.demos;
//计算在字符串abcdxyxydcba字符串中，有多少个xy字符串
public class Demo13_统计子串 {

	public static void main(String[] args) {
		String str = "abcdxyxydcba";
		String subStr = "xy";
		
		String result = str.replace(subStr, "");
		
		System.out.println((str.length() - result.length()) / subStr.length());
	}
}
