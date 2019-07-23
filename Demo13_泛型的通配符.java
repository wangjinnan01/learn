package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;

public class Demo13_泛型的通配符 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();
		c1.add("abc");
		c1.add("qq");
		
		Collection<Integer> c2 = new ArrayList<>();
		c2.add(123);
		c2.add(666);
		
//		c1.addAll(c2)//编译报错，因为c2的泛型不是c1泛型的子类
		
//		c1.removeAll(c2);
//		System.out.println(c1);
	}

}
