package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo12_��������ע������ {

	public static void main(String[] args) {
		Collection pers = new ArrayList();
		pers.add(new Person("zhangsan", 23));
		pers.add(new Person("lisi", 24));
		pers.add(new Person("wangwu", 25));
		
		//��ȡ����������
		Iterator it = pers.iterator();
		while (it.hasNext()) {
//			System.out.println(((Person)(it.next())).getName() + "..." + ((Person)(it.next())).getAge());
			Person p = (Person)(it.next());
			System.out.println(p.getName() + "..." + p.getAge());
		}
		
		
	}

}
