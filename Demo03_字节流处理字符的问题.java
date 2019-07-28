package com.ujiuye.demos;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo03_字节流处理字符的问题 {

	public static void main(String[] args) throws IOException {
		System.out.println(Arrays.toString("你".getBytes()));
		System.out.println(Arrays.toString("好".getBytes()));
		System.out.println(Arrays.toString("呵".getBytes()));
	}

	private static void test3_字节流读取汉字一次读两个字节() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}

	private static void test2_字节流读取汉字一次读取一个字节() throws FileNotFoundException, IOException {
		//将test.txt中的中文字符，读取出来，打印在控制台上
		FileInputStream fis = new FileInputStream("test.txt");
		int b;
		while((b = fis.read()) != -1) {
			System.out.println((char)b);
		}
		fis.close();
	}

	private static void test1_字节流写出字符() throws FileNotFoundException, IOException {
		//字节流写出字符
		String str = "你好你好";
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		fos.write(str.getBytes());
		fos.close();
	}

}
