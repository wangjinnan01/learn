package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo12_�ļ��Ŀ��� {
	public static void main(String[] args) throws IOException {
		//��a.txt������a_copy.txt
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		
		int b;//�ֽڱ�������ʾÿ�δ�Դ�ļ��ж�ȡ���ֽ���Ϣ
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}
}
