package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo06_List����ʵ�����ѯЧ�ʱȽ� {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		addList(al);
//		testList(al);
		
		LinkedList ll = new LinkedList();
		addList(ll);
		testList(ll);
	}
	
	public static void addList(List list) {
		for (int i = 0; i <= 999999; i++) {
			list.add(i);
		}
	}
	
	public static void testList(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <= 999999; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + "��ѯ100w��ʹ�õ�ʱ��Ϊ" + (end - start) + "����");
	} 

}
