package com.ujiuye.demos;

public class Demo12_µÝ¹éÁ·Ï°½×³Ë {
	public static void main(String[] args) {
		System.out.println(jiecheng(99999999));
	}
	
	/**
	 * nµÄ½×³Ë = n * (n-1)½×³Ë
	 */
	public static int jiecheng(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * jiecheng(n-1);
		}
	}
}
