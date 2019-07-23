package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo10_HashMap和Hashtable的比较 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put(null, "4");
		hm.put("", null);
		hm.put(null, null);
		System.out.println(hm);
	}

	private static void test1_Hashtable() {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("abc", "3");
//		ht.put(null, "4");
//		ht.put("", null);
//		ht.put(null, null);
		System.out.println(ht);
	}

}
