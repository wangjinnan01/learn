package com.ujiuye.demos;

import java.util.Scanner;

public class Demo07_捕获异常的第三种格式 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			int result = 10 / n;
		} finally {
			int[] arr = {3,5,7};
			System.out.println(arr[sc.nextInt()]);
		}
	}
}
