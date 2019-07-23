package com.ujiuye.demos;

import java.util.Arrays;

public class Demo11_泛型方法练习 {
	public static void main(String[] args) {
		Integer[] its = {11, 99, 44, 55, 22};
		System.out.println(Arrays.toString(its));
		swap(its, 0, 4);
		System.out.println(Arrays.toString(its));
	}
	
	//定义一个方法，可以交换任意引用类型数组中，两个指定索引的元素
	public static <T> void swap(T[] arr, int a, int b) {
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
