package com.ujiuye.demos;

import java.io.FileReader;
import java.io.IOException;

public class Demo04_FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("test.txt");
		int c;
		while ((c = fr.read()) != -1) {
			System.out.println((char)c);
		}
		fr.close();
	}	

}
