package com.ujiuye.demos;

public class Demo01_可变参数 {

	public static void main(String[] args) {
		System.out.println(getSum(1,2,3,4,5));
		System.out.println(getSum());
		System.out.println(getSum(6));
		
		print(666, 1, 2, 3, 4, 5);
	}
	
	//计算2个整数的和
	public static int getSum(int...a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
	
	public static void print(int x, int...a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println(x + "::" + sum);
	}

}
