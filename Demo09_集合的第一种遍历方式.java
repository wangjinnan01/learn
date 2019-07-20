package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;

public class Demo09_集合的第一种遍历方式 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(123);
		c.add("abc");
		c.add(new Person("zhangsan",23));
		c.add(666);
		
		//转成数组
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}
}
