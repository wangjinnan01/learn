package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;

public class Demo09_���ϵĵ�һ�ֱ�����ʽ {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(123);
		c.add("abc");
		c.add(new Person("zhangsan",23));
		c.add(666);
		
		//ת������
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}
}
