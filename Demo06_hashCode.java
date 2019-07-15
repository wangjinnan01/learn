package com.ujiuye.demos;

public class Demo06_hashCode {
	public static void main(String[] args) {
		Object obj1 = new Object();
		int hc = obj1.hashCode();
		System.out.println(hc);
		System.out.println(Integer.toHexString(hc));
		
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.getClass().getName() + "@" + Integer.toHexString(p.hashCode()));
	}
}
