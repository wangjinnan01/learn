package com.day07;

public class ArrayTool {

	private ArrayTool () {}
	public static void printArr(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int getMax(int [] arr) {
		int Max = arr[0];
		for (int i = 1 ; i < arr.length; i++) {
			
			if(Max < arr[i]) {
				Max = arr[i];
			}
			
		}
		return Max;
	}
}
