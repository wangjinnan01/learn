package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo15_�����޸��쳣 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0, "abc");
		list.add(0, 888);
		list.add(1, "hello");
		list.add(1, "xyz");
		list.add(3, 666);
		
		//ʹ�õ������������ϣ����������"hello"�����ڼ��������һ��java
		test4_������������������ɾ(list);
	}

	private static void test4_������������������ɾ(List list) {
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			Object obj = lit.next();
			if (obj.equals("hello")) {
				lit.add("java");
			}
		}
		System.out.println(list);
	}

	private static void test3_����������������ɾ��(List list) {
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("hello")) {
				it.remove();
			}
		}
		System.out.println(list);
	}

	private static void test2_���ϱ���������ɾ(List list) {
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj.equals("hello")) {
				list.add("java");
			}
		}
		System.out.println(list);
	}

	private static void test1_�����޸��쳣��ʾ(List list) {
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
