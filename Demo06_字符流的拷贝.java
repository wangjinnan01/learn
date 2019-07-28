package com.ujiuye.demos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo06_×Ö·ûÁ÷µÄ¿½±´ {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		FileReader fr = new FileReader("char.txt");
		FileWriter fw = new FileWriter("char_copy.txt");
		
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		fr.close();
		fw.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
