package com.ujiuye.demos;

import java.io.FileWriter;
import java.io.IOException;

public class Demo07_FileWriter��Чԭ�� {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("fw.txt");
		fw.write("abcdefg");
		fw.flush();
	}
}
