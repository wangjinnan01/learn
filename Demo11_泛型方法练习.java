package com.ujiuye.demos;

import java.util.Arrays;

public class Demo11_���ͷ�����ϰ {
	public static void main(String[] args) {
		Integer[] its = {11, 99, 44, 55, 22};
		System.out.println(Arrays.toString(its));
		swap(its, 0, 4);
		System.out.println(Arrays.toString(its));
	}
	
	//����һ�����������Խ��������������������У�����ָ��������Ԫ��
	public static <T> void swap(T[] arr, int a, int b) {
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
