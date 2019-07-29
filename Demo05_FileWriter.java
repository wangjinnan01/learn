package com.ujiuye.demos;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05_FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("test.txt", true);
		fw.write("x´ó¼ÒºÃ");
		fw.close();
	}
}
