package com.day06;

public class ��ά���� {

	public static void main(String[] args) {
		int [][] arr = new int[3][5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1][1]);
		System.out.println("------------");
		
		int [][] arr1 = {{1,2,3,4},{5,6,7},{8,9,90}};
		System.out.println(arr1[0]);
		System.out.println(arr1[0][2]);
		System.out.println(arr1[2][2]);
		System.out.println("---------------");
		
		for (int i = 0;i < arr1.length;i++) {
			//����һ��ѭ��,����ÿһ������
			for(int j = 0;j < arr1[i].length;j++) {
				//����arr[i] �������
				System.out.print(arr1[i][j] + " ");
				
			}
			System.out.println();
		}

		
	}

}
