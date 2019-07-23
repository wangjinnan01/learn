package com.ujiuye.demos;

import java.util.LinkedList;

public class Demo03_LinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("hejiu");
		list.add("zhaoliu");
		list.add("chishi");
		list.add("zhangsan");
		list.add("lisi");
		list.add("zhouqi");
		
		//寻找第5名的同学，索引为4
		System.out.println(list.get(4));
	}
}
