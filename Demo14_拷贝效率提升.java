package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo14_拷贝效率提升 {
	public static void main(String[] args) throws IOException {
		test3_小数组的最终格式();
	}

	private static void test3_小数组的最终格式() throws FileNotFoundException, IOException {
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

	private static void test2_使用小数组拷贝小文件() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		
		byte[] arr = new byte[2];
		int len;//本次读取到的有效字节的个数
		while ((len = fis.read(arr)) != -1 ) {
			fos.write(arr, 0, len);
		}
		
		fis.close();
		fos.close();
	}

	private static void test1_使用大数组拷贝() throws FileNotFoundException, IOException {
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
