package com.ujiuye.demos;

import java.util.Arrays;

public class Demo06_对象类型的数组 {

	public static void main(String[] args) {
		Person[] pers = new Person[3];
		pers[0] = new Person("zhangsan", 23);
		pers[1] = new Person("lisi", 24);
		pers[2] = new Person("wangwu", 25);
		System.out.println(pers);
		System.out.println(Arrays.toString(pers));
	}
}
