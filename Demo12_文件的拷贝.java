package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo12_文件的拷贝 {
	public static void main(String[] args) throws IOException {
		//将a.txt拷贝成a_copy.txt
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		
		int b;//字节变量，表示每次从源文件中读取的字节信息
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}
}
