package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo12_迭代器的注意事项 {

	public static void main(String[] args) {
		Collection pers = new ArrayList();
		pers.add(new Person("zhangsan", 23));
		pers.add(new Person("lisi", 24));
		pers.add(new Person("wangwu", 25));
		
		//获取迭代器对象
		Iterator it = pers.iterator();
		while (it.hasNext()) {
//			System.out.println(((Person)(it.next())).getName() + "..." + ((Person)(it.next())).getAge());
			Person p = (Person)(it.next());
			System.out.println(p.getName() + "..." + p.getAge());
		}
		
		
	}

}
