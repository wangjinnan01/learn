package com.ujiuye.demos;

public class Demo07_toString {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);
		
		Plant p1 = new Plant("Ð¡°×", 300.0, 30);
		System.out.println(p1.toString());
	}
}
