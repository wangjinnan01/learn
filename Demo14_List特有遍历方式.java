package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.List;

public class Demo14_List特有遍历方式 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0, "abc");
		list.add(0, 888);
		list.add(1, "xyz");
		list.add(3, 666);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
