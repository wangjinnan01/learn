package com.ujiuye.demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo15_Set的遍历 {
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

	private static void test6_增强for() {
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

	private static void test5_带泛型转数组_参数大集合小(Set<Integer> set) {
		Integer[] arr = new Integer[5];
		set.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void test4_带泛型转数组_参数和集合一样大(Set<Integer> set) {
		Integer[] arr = new Integer[3];
		Integer[] arrNew = set.toArray(arr);
		System.out.println(arr);
		System.out.println(arrNew);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrNew));
	}

	private static void test3_带泛型的转数组_参数小集合大(Set<Integer> set) {
		Integer[] arr = new Integer[2];
		System.out.println(arr);
		
		Integer[] arrNew = set.toArray(arr);
		System.out.println(arrNew);
		System.out.println(arrNew.length);
		System.out.println(Arrays.toString(arrNew));
	}

	private static void test2_不带泛型转数组(Set<Integer> set) {
		Object[] objs = set.toArray();
		for (int i = 0; i < objs.length; i++) {
			Integer inte = (Integer)objs[i];
			System.out.println(inte);
		}
	}

	private static void test1_迭代器(Set<Integer> set) {
		//获取迭代器
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}
}
