package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01_字符流处理不同编码文件的问题 {
	public static void main(String[] args) throws IOException {
		//使用字符流拷贝
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		fr.close();
		fw.close();
	}

	private static void test1_字节流拷贝不同编码的文件() throws FileNotFoundException, IOException {
		//使用字节流拷贝
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		int b;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}
}
