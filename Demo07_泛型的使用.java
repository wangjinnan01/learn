package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo07_���͵�ʹ�� {
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

	private static void test2_���͵ĺô�() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("qq");
//		list.add(666);������Ӳ�ͬ���͵�Ԫ��
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println(str);
		}
	}

	private static void test1_���͵�ʹ��() {
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
