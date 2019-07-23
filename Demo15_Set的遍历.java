package com.ujiuye.demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo15_Set�ı��� {
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
		
		for (Integer inte : set) {
			
		}
		
		
		
	}

	private static void test6_��ǿfor() {
		Set<Person> pers = new HashSet<>();
		pers.add(new Person("zhangsan", 23));
		pers.add(new Person("lisi", 24));
		
		for (Person p : pers) {
			p.setAge(p.getAge() + 30);
		}
		
		for (Person p : pers) {
			System.out.println(p);
		}
	}

	private static void test5_������ת����_�����󼯺�С(Set<Integer> set) {
		Integer[] arr = new Integer[5];
		set.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void test4_������ת����_�����ͼ���һ����(Set<Integer> set) {
		Integer[] arr = new Integer[3];
		Integer[] arrNew = set.toArray(arr);
		System.out.println(arr);
		System.out.println(arrNew);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrNew));
	}

	private static void test3_�����͵�ת����_����С���ϴ�(Set<Integer> set) {
		Integer[] arr = new Integer[2];
		System.out.println(arr);
		
		Integer[] arrNew = set.toArray(arr);
		System.out.println(arrNew);
		System.out.println(arrNew.length);
		System.out.println(Arrays.toString(arrNew));
	}

	private static void test2_��������ת����(Set<Integer> set) {
		Object[] objs = set.toArray();
		for (int i = 0; i < objs.length; i++) {
			Integer inte = (Integer)objs[i];
			System.out.println(inte);
		}
	}

	private static void test1_������(Set<Integer> set) {
		//��ȡ������
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}
}
