package com.ujiuye.demos;

import java.util.HashSet;
import java.util.Set;

public class Demo14_Set¸ÅÊö {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(123);
		set.add(888);
		set.add(666);
		set.add(123);
		set.add(123);
		set.add(123);
		set.add(666);
		set.add(888);
		
		System.out.println(set);
	}
}
