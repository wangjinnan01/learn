package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo08_����ʱ�쳣�ͱ���ʱ�쳣 {
	public static void main(String[] args) {
		
		int n = new Scanner(System.in).nextInt();
		if (n != 0) {//����ʱ�쳣���Ա���
			int result = 10 / n;
		}
		
		try {//����ʱ�쳣ֻ�ܴ����������
			FileInputStream fis = new FileInputStream("D:/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
