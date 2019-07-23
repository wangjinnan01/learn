package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo07_泛型的使用 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("xyz");
		list.add("abc");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	private static void test2_泛型的好处() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("qq");
//		list.add(666);不能添加不同类型的元素
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println(str);
		}
	}

	private static void test1_泛型的使用() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("qq");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
