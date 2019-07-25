package com.ujiuye.demos;

public class Demo09_异常体系中的常用方法 {

	public static void main(String[] args) {
		try {
			test2();
			test3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test3() {
		test4();
		test5();
	}

	private static void test5() {
		test7();
	}

	private static void test4() {
		test7();
	}

	private static void test7() {
		int i = 1 / 0;
	}

	private static void test2() {
		test4();
		test6();
	}

	private static void test6() {
		test8();
	}

	private static void test8() {
		System.out.println("test8");
	}

	private static void test1() {
		try {
			int result = 1 / 0;
		} catch (ArithmeticException ae) {//捕获异常：就是异常对象给异常引用赋值
			Throwable t = ae.getCause();
			System.out.println(t);
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			System.out.println(ae.getClass().getName() + ":" + ae.getMessage());
		}
	}

}
