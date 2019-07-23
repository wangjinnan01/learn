package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo05_List三种实现类的添加效率 {

	public static void main(String[] args) {
//		LinkedList ll = new LinkedList();
//		testList(ll);
		
//		ArrayList al = new ArrayList();
//		testList(al);
		
		Vector v = new Vector();
		testList(v);
	}
	
	public static long testList(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <= 999999; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + "添加100w次使用的时间为" + (end - start) + "毫秒");
		return end - start;
	}

}
