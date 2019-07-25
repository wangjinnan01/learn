package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo08_运行时异常和编译时异常 {
	public static void main(String[] args) {
		
		int n = new Scanner(System.in).nextInt();
		if (n != 0) {//运行时异常可以避免
			int result = 10 / n;
		}
		
		try {//编译时异常只能处理或者声明
			FileInputStream fis = new FileInputStream("D:/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
