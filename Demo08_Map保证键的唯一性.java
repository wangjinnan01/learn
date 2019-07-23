package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Map;

public class Demo08_Map保证键的唯一性 {
	public static void main(String[] args) {
		HashMap<Student, String> map = new HashMap<>();
		map.put(new Student("wangwu", 55), "bj");
		map.put(new Student("zhaoliu", 66), "sh");
		map.put(new Student("wangwu", 55), "sz");
		System.out.println(map);
	}

	private static void test1_存储jdk提供的类型的键() {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 3);
		map.put("qq", 2);
		map.put("xyzqwer", 7);
		
		map.put("abc", 4);
		System.out.println(map);
	}
}
