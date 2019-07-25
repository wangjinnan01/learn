package com.ujiuye.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo02_Collectionsπ§æﬂ¿‡ {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, -123, 234, 666, -888, 888);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		int index = Collections.binarySearch(list, -888);
		System.out.println(index);
		
		Collections.fill(list, 666);
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, 666));
		
		Collections.replaceAll(list, 666, 888);
		System.out.println(list);
		
		list.set(0, 123);
		list.set(2, 666);
		list.set(4, -999);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		/*List<Integer> empty = Collections.emptyList();
		empty.add(666);*/
		
		
		/*LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> queue = Collections.asLifoQueue(ll);
		queue.add(123);
		queue.add(456);
		queue.add(-321);
		queue.add(666);
		System.out.println(queue);*/
	}

}
