package com.ujiuye.demos;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo03_内存输出流 {

	public static void main(String[] args) throws IOException {
		//将a.txt中的内容，打印在控制台上
		//要求使用字节流，要求使用字节数组大小为3
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] arr = new byte[3];//每次无法读取到一个完整的信息，所以可以将不完整的信息，存储到一个缓冲区中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int len;
		while ((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		fis.close();
		
		System.out.println(Arrays.toString(baos.toByteArray()));
		System.out.println(baos.toString());
	}

	private static void test1_使用指定大小的字节数组读取文件() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] arr = new byte[3];
		int len;
		while ((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}

}
