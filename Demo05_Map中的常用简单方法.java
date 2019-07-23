package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Map;

public class Demo05_Map中的常用简单方法 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(-5, 25);
		map.put(-3, 9);
		map.put(0, 0);
		map.put(3, 9);
		map.put(4, 16);
		
		System.out.println(map);
		
		map.put(0, 1);
		System.out.println(map);
		
		map.remove(0);
		System.out.println(map);
		
		System.out.println(map.get(-5));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey(4));
		System.out.println(map.containsKey(0));
		
		map.clear();
		System.out.println(map);
	}
}
