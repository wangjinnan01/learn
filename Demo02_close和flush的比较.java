package com.ujiuye.demos;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02_close和flush的比较 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis
		 	= new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedOutputStream bos
		 	= new BufferedOutputStream(new FileOutputStream("a_copy.txt"));
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
			bos.flush();
		}
		
		bis.close();
		
	}
}
