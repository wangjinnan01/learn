package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.List;

public class Demo13_List的概述和特有方法 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0, "abc");
		list.add(0, 888);
		list.add(1, "xyz");
		list.add(3, 666);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(2, 333);
		System.out.println(list);
		
		System.out.println(list.get(0));
	}
}
