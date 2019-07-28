package com.ujiuye.demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo11_高效缓冲字符流的特有方法 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("T.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("T_copy.java"));
		String line;
		while ((line = br.readLine()) != null) {
//			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
