package com.ujiuye.demos;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo03_�ֽ��������ַ������� {

	public static void main(String[] args) throws IOException {
		System.out.println(Arrays.toString("��".getBytes()));
		System.out.println(Arrays.toString("��".getBytes()));
		System.out.println(Arrays.toString("��".getBytes()));
	}

	private static void test3_�ֽ�����ȡ����һ�ζ������ֽ�() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}

	private static void test2_�ֽ�����ȡ����һ�ζ�ȡһ���ֽ�() throws FileNotFoundException, IOException {
		//��test.txt�е������ַ�����ȡ��������ӡ�ڿ���̨��
		FileInputStream fis = new FileInputStream("test.txt");
		int b;
		while((b = fis.read()) != -1) {
			System.out.println((char)b);
		}
		fis.close();
	}

	private static void test1_�ֽ���д���ַ�() throws FileNotFoundException, IOException {
		//�ֽ���д���ַ�
		String str = "������";
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		fos.write(str.getBytes());
		fos.close();
	}

}
