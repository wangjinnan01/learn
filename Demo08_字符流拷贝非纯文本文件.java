package com.ujiuye.demos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo08_字符流拷贝非纯文本文件 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a_copy.wmv");
		FileWriter fw = new FileWriter("a_char.wmv");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		fr.close();
		fw.close();
	}
}
