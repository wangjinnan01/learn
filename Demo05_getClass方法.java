package com.ujiuye.demos;

public class Demo05_getClass·½·¨ {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		System.out.println(a);
		System.out.println(a.getClass().getName());
	}
}
