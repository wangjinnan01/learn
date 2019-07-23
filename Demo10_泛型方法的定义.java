package com.ujiuye.demos;

public class Demo10_泛型方法的定义 {
	public static void main(String[] args) {
		testPrint(new Person("zhangsan", 23));
	}
	
	public static <W> void testPrint(W w) {
		System.out.println(w.toString());
	}
}
