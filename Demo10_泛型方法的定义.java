package com.ujiuye.demos;

public class Demo10_���ͷ����Ķ��� {
	public static void main(String[] args) {
		testPrint(new Person("zhangsan", 23));
	}
	
	public static <W> void testPrint(W w) {
		System.out.println(w.toString());
	}
}
