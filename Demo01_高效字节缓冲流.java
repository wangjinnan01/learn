package com.ujiuye.demos;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01_��Ч�ֽڻ����� {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		//׼����ͨ���ֽ���
		FileInputStream fis = new FileInputStream("a.wmv");
		FileOutputStream fos = new FileOutputStream("a_copy.wmv");
		
		//��ǿ
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
