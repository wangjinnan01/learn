package com.ujiuye.demos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo09_小数组字符流拷贝 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileReader fr = new FileReader("char.txt");
		FileWriter fw = new FileWriter("char_smallArray.txt");
		
		char[] chs = new char[1024 * 8];
		int len;//本次读取到的有效字符的个数
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		fr.close();
		fw.close();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
