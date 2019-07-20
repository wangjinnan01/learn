package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;

public class Demo08_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(123);
		c.add("abc");
		c.add(new Person("zhangsan",23));
		c.add(666);
		
		System.out.println(c);
		
		c.remove(123);
		System.out.println(c);
		
		System.out.println(c.size());
		
		System.out.println(c.isEmpty());
		
		System.out.println(c.contains(666));
		
		c.clear();
		System.out.println(c.isEmpty() + "..." + c.size());
		
	}
}
