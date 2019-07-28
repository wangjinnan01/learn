package com.ujiuye.demos;

public class Demo13_斐波那契数 {
	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
	
	/**
	 * 有数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		定义一个方法，可以计算第n个斐波那契数
	 */
	public static int fibo(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1 || n== 2) {
			return 1;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}
