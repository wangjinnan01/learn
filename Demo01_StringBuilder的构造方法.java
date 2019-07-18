package com.ujiuye.demos;

public class Demo01_StringBuilder的构造方法 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		StringBuilder sb2 = new StringBuilder("abcdefg");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
	}

}
