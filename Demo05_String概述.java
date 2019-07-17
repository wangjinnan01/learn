package com.ujiuye.demos;

public class Demo05_String¸ÅÊö {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
		str = "xyz";
		System.out.println(str);
		
		Person p = new Person("zhangsan", 23);
		System.out.println(p);
		System.out.println(p.getName() + "..." + p.getAge());
		p = new Person("zhangsan", 24);
	}
}
