package com.ujiuye.demos;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01_高效字节缓冲流 {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		//准备普通的字节流
		FileInputStream fis = new FileInputStream("a.wmv");
		FileOutputStream fos = new FileOutputStream("a_copy.wmv");
		
		//加强
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(~b);
		}
		bis.close();
		bos.close();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
