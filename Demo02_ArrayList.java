package com.ujiuye.demos;

import java.util.ArrayList;

public class Demo02_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("xyz");
		list.add("abc");
		
		System.out.println(list.get(2));
		
		list.add(0, "qq");
		System.out.println(list);
	}

}
