package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;

public class Demo10_带All的方法 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(123);
		c1.add("abc");
		c1.add(666);
		
		Collection c2 = new ArrayList();
		c2.add(123);
		c2.add("xyz");
		c2.add(888);
		
		/*c1.addAll(c2);
		
		
		c1.removeAll(c2);*/
		System.out.println(c1.containsAll(c2));
		c1.retainAll(c2);
		System.out.println(c1);
		System.out.println(c2);
	}
}
