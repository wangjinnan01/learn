package com.ujiuye.demos;

import java.util.LinkedList;

public class Demo04_LinkedList特有方法 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("abc");
		list.addFirst(123);
		list.addLast(456);
		list.addFirst("xyz");
		list.addFirst("qq");
		
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
	}
}
