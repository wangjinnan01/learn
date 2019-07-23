package com.ujiuye.demos;

import java.util.LinkedList;

public class Demo09_泛型类练习 {

	public static void main(String[] args) {
		MyStack<Integer> mc = new MyStack<>();
		mc.push(123);
		mc.push(666);
		mc.push(888);
		
		while (!mc.isEmpty()) {
			Integer i = mc.pop();
			System.out.println(i);
		}
	}

}
//自定义一个集合，只能在集合的头部，进行添加和删除，不能在其他位置增删
/**
 * 这种只能在集合的头部进行增删的集合，就称为栈（stack）：先进后出
 */
class MyStack<E> {
	private LinkedList<E> list = new LinkedList<>();
	
	public void push(E e) {
		list.addFirst(e);
	}
	
	public E pop() {
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}