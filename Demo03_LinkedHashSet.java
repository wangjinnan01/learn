package com.ujiuye.demos;

import java.util.LinkedHashSet;

public class Demo03_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("abc");
		lhs.add("abc");
		lhs.add("abc");
		lhs.add("888");
		lhs.add("888");
		lhs.add("888");
		lhs.add("xyz");
		lhs.add("xyz");
		lhs.add("qq");
		
		System.out.println(lhs);
	}
}
