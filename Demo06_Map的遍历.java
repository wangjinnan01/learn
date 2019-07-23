package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo06_Map的遍历 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 3);
		map.put("qq", 2);
		map.put("xyzqwer", 7);

		test22_根据键值对对象获取键和值_增强for(map);
		
	}

	private static void test22_根据键值对对象获取键和值_增强for(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "..." + en.getValue());
		}
	}

	private static void test21_根据键值对对象获取键和值_迭代器(Map<String, Integer> map) {
		//获取键值对对象的Set集合
		Set<Map.Entry<String, Integer>> ens =  map.entrySet();
		//获取迭代器
		Iterator<Map.Entry<String, Integer>> it = ens.iterator();
		while (it.hasNext()) {
			//获取每个键值对对象
			Map.Entry<String, Integer> en = it.next();
			//分别获取键和值
			String key = en.getKey();
			int value = en.getValue();
			System.out.println(key + "..." + value);
		}
	}

	private static void test12_根据键获取值_增强for(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key + "..." + map.get(key));
		}
	}

	private static void test11_根据键获取值_迭代器(Map<String, Integer> map) {
		//第一种遍历思路的第一种实现方式
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key + "..." + value);
		}
	}

}
