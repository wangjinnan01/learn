package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo14_����Ч������ {
	public static void main(String[] args) throws IOException {
		test3_С��������ո�ʽ();
	}

	private static void test3_С��������ո�ʽ() throws FileNotFoundException, IOException {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("a.wmv");
		FileOutputStream fos = new FileOutputStream("a_copy2.wmv");
		
		byte[] arr = new byte[1024];
		int len;
		while ((len = fis.read(arr)) != -1) {
			fos.write(arr, 0, len);
		}
		
		fis.close();
		fos.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

	private static void test2_ʹ��С���鿽��С�ļ�() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		
		byte[] arr = new byte[2];
		int len;//���ζ�ȡ������Ч�ֽڵĸ���
		while ((len = fis.read(arr)) != -1 ) {
			fos.write(arr, 0, len);
		}
		
		fis.close();
		fos.close();
	}

	private static void test1_ʹ�ô����鿽��() throws FileNotFoundException, IOException {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("a.wmv");
		FileOutputStream fos = new FileOutputStream("a_copy2.wmv");
		
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		fos.write(arr);
		
		fis.close();
		fos.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
