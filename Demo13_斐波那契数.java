package com.ujiuye.demos;

public class Demo13_쳲������� {
	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
	
	/**
	 * �����У�1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		����һ�����������Լ����n��쳲�������
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
