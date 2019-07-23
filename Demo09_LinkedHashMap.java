package com.ujiuye.demos;

import java.util.LinkedHashMap;

public class Demo09_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("xyzqwer", 7);
		lhm.put("abc", 3);
		lhm.put("qq", 2);
		System.out.println(lhm);
	}
}
