package com.ujiuye.demos;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo03_�ڴ������ {

	public static void main(String[] args) throws IOException {
		//��a.txt�е����ݣ���ӡ�ڿ���̨��
		//Ҫ��ʹ���ֽ�����Ҫ��ʹ���ֽ������СΪ3
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] arr = new byte[3];//ÿ���޷���ȡ��һ����������Ϣ�����Կ��Խ�����������Ϣ���洢��һ����������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int len;
		while ((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		fis.close();
		
		System.out.println(Arrays.toString(baos.toByteArray()));
		System.out.println(baos.toString());
	}

	private static void test1_ʹ��ָ����С���ֽ������ȡ�ļ�() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] arr = new byte[3];
		int len;
		while ((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}

}
