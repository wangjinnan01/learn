package com.ujiuye.demos;

public class Demo12_�ݹ���ϰ�׳� {
	public static void main(String[] args) {
		System.out.println(jiecheng(99999999));
	}
	
	/**
	 * n�Ľ׳� = n * (n-1)�׳�
	 */
	public static int jiecheng(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * jiecheng(n-1);
		}
	}
}
