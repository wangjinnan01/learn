package com.ujiuye.demos;

import java.util.LinkedList;

public class Demo09_��������ϰ {

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
//�Զ���һ�����ϣ�ֻ���ڼ��ϵ�ͷ����������Ӻ�ɾ��������������λ����ɾ
/**
 * ����ֻ���ڼ��ϵ�ͷ��������ɾ�ļ��ϣ��ͳ�Ϊջ��stack�����Ƚ����
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