package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo09_FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		int b;
		while ((b = fis.read()) != -1) {
			System.out.println(b);
		}
		/*int b = fis.read();
		System.out.println(b);
		
		b = fis.read();
		System.out.println(b);
		b = fis.read();
		System.out.println(b);
		b = fis.read();
		System.out.println(b);
		b = fis.read();
		System.out.println(b);
		b = fis.read();
		System.out.println(b);
		b = fis.read();
		System.out.println(b);*/
//		FileInputStream fis2 = new FileInputStream("qq.txt");
	}
}
