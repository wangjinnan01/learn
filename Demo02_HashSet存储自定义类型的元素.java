package com.ujiuye.demos;

import java.util.HashSet;

public class Demo02_HashSet存储自定义类型的元素 {

	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("zhangsan", 23));
		hs.add(new Person("zhangsan", 23));
		hs.add(new Person("zhangsan", 23));
		hs.add(new Person("lisi", 24));
		hs.add(new Person("lisi", 24));
		
		for (Person per : hs) {
			System.out.println(per.hashCode());
		}
		
		System.out.println(hs);
	}

}
