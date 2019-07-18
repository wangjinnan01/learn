package com.ujiuye.demos;

public class Demo10_Integer的成员方法 {
	public static void main(String[] args) {
		test5_valueOf();
	}

	private static void test5_valueOf() {
		String num = 666 + "";
		String num2 = String.valueOf(666);
	}

	private static void test4_toString() {
		int num = 100;
		System.out.println(Integer.toString(num, 5));
		System.out.println(Integer.toString(num, 7));
		System.out.println(Integer.toString(num, 17));
		System.out.println(Integer.toString(num, 36));
	}

	private static void test3_toXxxString() {
		int num = 100;
		System.out.println(Integer.toString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));
	}

	private static void test2_parseInt() {
		String num = "100";
		int i = Integer.parseInt(num);
		System.out.println(i + 1);
		
		int j = Integer.parseInt(num, 2);
		System.out.println(j + 1);
		
		int k = Integer.parseInt(num, 16);
		System.out.println(k);
	}

	private static void test1_xxxValue() {
		String num = "123";
		//转成Integer对象
		Integer it = new Integer(num);
		//获取对象中的int数据
		int i = it.intValue();
		System.out.println(i + 1);
	}
}
