package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo11_迭代器 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(123);
		c.add("abc");
		c.add(new Person("zhangsan",23));
		c.add(666);
		
		//获取迭代器
		Iterator it = c.iterator();
		//判断是否有下一个元素
		/*System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());*/
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
