package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo11_������ {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(123);
		c.add("abc");
		c.add(new Person("zhangsan",23));
		c.add(666);
		
		//��ȡ������
		Iterator it = c.iterator();
		//�ж��Ƿ�����һ��Ԫ��
		/*System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());*/
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
