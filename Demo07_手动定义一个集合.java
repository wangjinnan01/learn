package com.ujiuye.demos;

import java.util.Arrays;

public class Demo07_手动定义一个集合 {

	public static void main(String[] args) {
		/*Person[] pers = new Person[3];
		pers[0] = new Person("zhangsan", 23);
		pers[1] = new Person("lisi", 24);
		pers[2] = new Person("wangwu", 25);
		System.out.println(pers);
		System.out.println(Arrays.toString(pers));
		
		Person[] persTemp = new Person[4];
		for (int i = 0; i < persTemp.length; i++) {
			persTemp[i] = pers[i];
		}
		persTemp[3] = new Person("zhaoliu", 26);*/
		MyCollection mc = new MyCollection();
		mc.add(new Person("zhangsan", 23));
		mc.add(new Person("lisi", 24));
		mc.add(new Person("wangwu", 25));
		
		System.out.println(mc.length());
		
		System.out.println(mc.contains(new Person("lisi", 24)));
	}
}

class MyCollection {
	private Person[] pers;
	
	public MyCollection() {
		pers = new Person[0];
	}
	
	public void add(Person p) {
		Person[] temp = new Person[pers.length + 1];
		for (int i = 0; i < pers.length; i++) {
			temp[i] = pers[i];
		}
		temp[temp.length - 1] = p;
		pers = temp;
	}
	
	public boolean contains(Person p) {
		for (int i = 0; i < pers.length; i++) {
			if (p.equals(pers[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int length() {
		return pers.length;
	}
}
