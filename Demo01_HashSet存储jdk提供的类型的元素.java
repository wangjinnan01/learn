package com.ujiuye.demos;

import java.util.HashSet;

public class Demo01_HashSet存储jdk提供的类型的元素 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("abc");
		hs.add("abc");
		hs.add("abc");
		hs.add("xyz");
		hs.add("xyz");
		hs.add("xyz");
		hs.add("xyz");
		hs.add("xyz");
		hs.add("xyz");
		hs.add("qq");
		hs.add("qq");
		
		System.out.println(hs);
	}

}
