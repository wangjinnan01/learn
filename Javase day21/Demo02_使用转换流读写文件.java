package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo02_ʹ��ת������д�ļ� {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");
		OutputStreamWriter osw 
			= new OutputStreamWriter(new FileOutputStream("b.txt"), "utf8");
		int c;
		while ((c = fr.read()) != -1) {
			osw.write(c);
		}
		fr.close();
		osw.close();
	}

	private static void test3_ʹ��OutputStreamWriterд����utf8()
			throws FileNotFoundException, UnsupportedEncodingException, IOException {
		//���ڴ��еġ����ã���Ҳ�á�
		FileOutputStream fos = new FileOutputStream("b.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf8");
		osw.write("���ã���Ҳ��");
		osw.close();
	}

	private static void test2_ʹ��InputStreamReader��ȡutf8()
			throws FileNotFoundException, UnsupportedEncodingException, IOException {
		//ʹ��InputStreamReader
		FileInputStream fis = new FileInputStream("b.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf8");
		int c;
		while ((c = isr.read()) != -1) {
			System.out.println((char)c);
		}
		isr.close();
	}

	private static void test1_ʹ��Ĭ�Ͻ�����ʽ��ȡutf8() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("b.txt");
		int c;
		while ((c = fr.read()) != -1) {
			System.out.println((char)c);
		}
		fr.close();
	}
}
