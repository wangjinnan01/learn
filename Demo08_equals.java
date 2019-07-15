package com.ujiuye.demos;

public class Demo08_equals {

	public static void main(String[] args) {
		/*Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.equals(obj2));*/
		
		Plant p1 = new Plant("Ð¡°×", 300.0, 30);
		Plant p2 = new Plant("Ð¡°×", 300.0, 30);
		System.out.println(p1.equals(p2));
		Plant p3 = new Plant("Ð¡°×", 400.0, 40);
		System.out.println(p1.equals(p3));
	}

}
