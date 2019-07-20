package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo15_并发修改异常 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0, "abc");
		list.add(0, 888);
		list.add(1, "hello");
		list.add(1, "xyz");
		list.add(3, 666);
		
		//使用迭代器遍历集合，如果碰到了"hello"，就在集合中添加一个java
		test4_迭代器遍历迭代器增删(list);
	}

	private static void test4_迭代器遍历迭代器增删(List list) {
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			Object obj = lit.next();
			if (obj.equals("hello")) {
				lit.add("java");
			}
		}
		System.out.println(list);
	}

	private static void test3_迭代器遍历迭代器删除(List list) {
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("hello")) {
				it.remove();
			}
		}
		System.out.println(list);
	}

	private static void test2_集合遍历集合增删(List list) {
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj.equals("hello")) {
				list.add("java");
			}
		}
		System.out.println(list);
	}

	private static void test1_并发修改异常演示(List list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("hello")) {
				list.add("java");
			}
		}
		System.out.println(list);
	}
}
