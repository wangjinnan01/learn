package com.ujiuye.demos;

public class Demo04_StringBuilder���滻�ͷ�ת {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdxyz");
		sb.replace(2, 4, "qq");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
