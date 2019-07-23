package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo06_Map�ı��� {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 3);
		map.put("qq", 2);
		map.put("xyzqwer", 7);

		test22_���ݼ�ֵ�Զ����ȡ����ֵ_��ǿfor(map);
		
	}

	private static void test22_���ݼ�ֵ�Զ����ȡ����ֵ_��ǿfor(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "..." + en.getValue());
		}
	}

	private static void test21_���ݼ�ֵ�Զ����ȡ����ֵ_������(Map<String, Integer> map) {
		//��ȡ��ֵ�Զ����Set����
		Set<Map.Entry<String, Integer>> ens =  map.entrySet();
		//��ȡ������
		Iterator<Map.Entry<String, Integer>> it = ens.iterator();
		while (it.hasNext()) {
			//��ȡÿ����ֵ�Զ���
			Map.Entry<String, Integer> en = it.next();
			//�ֱ��ȡ����ֵ
			String key = en.getKey();
			int value = en.getValue();
			System.out.println(key + "..." + value);
		}
	}

	private static void test12_���ݼ���ȡֵ_��ǿfor(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key + "..." + map.get(key));
		}
	}

	private static void test11_���ݼ���ȡֵ_������(Map<String, Integer> map) {
		//��һ�ֱ���˼·�ĵ�һ��ʵ�ַ�ʽ
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key + "..." + value);
		}
	}

}
