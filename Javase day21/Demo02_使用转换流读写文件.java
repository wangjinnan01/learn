package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo02_使用转换流读写文件 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");
		OutputStreamWriter osw 
			= new OutputStreamWriter(new FileOutputStream("b.txt"), "utf8");
		int c;
		while ((c = fr.read()) != -1) {
			osw.write(c);
		}
		fr.close();
		osw.close();
	}

	private static void test3_使用OutputStreamWriter写出到utf8()
			throws FileNotFoundException, UnsupportedEncodingException, IOException {
		//将内存中的“他好，我也好”
		FileOutputStream fos = new FileOutputStream("b.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf8");
		osw.write("他好，我也好");
		osw.close();
	}

	private static void test2_使用InputStreamReader读取utf8()
			throws FileNotFoundException, UnsupportedEncodingException, IOException {
		//使用InputStreamReader
		FileInputStream fis = new FileInputStream("b.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf8");
		int c;
		while ((c = isr.read()) != -1) {
			System.out.println((char)c);
		}
		isr.close();
	}

	private static void test1_使用默认解码形式读取utf8() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("b.txt");
		int c;
		while ((c = fr.read()) != -1) {
			System.out.println((char)c);
		}
		fr.close();
	}
}
