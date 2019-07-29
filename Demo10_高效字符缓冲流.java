package com.ujiuye.demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo10_¸ßÐ§×Ö·û»º³åÁ÷ {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new FileReader("char.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("char_buf.txt"));
		
		int c;
		while ((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
