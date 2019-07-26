package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Demo08_InputStream {
	public static void main(String[] args) throws IOException {
		//�����ֽ�������
		InputStream is = new FileInputStream("a.txt");
		//ͨ��read������ȡ��һ���ֽڣ���ת���ַ�����
		char c1 = (char)(is.read());
		System.out.println(c1);
		
		//��ȡ���Զ�ȡ��ʣ���ֽڸ���
		System.out.println(is.available());
		
		//׼���ֽ���������
		byte[] arr = new byte[2];
		//����������ֽڶ�ȡ��������
		System.out.println(is.read(arr));//2
		System.out.println(Arrays.toString(arr));//98,99
		//�ٴν���������ֽڣ���ȡ��arr������
		System.out.println(is.read(arr));//1
		System.out.println(Arrays.toString(arr));//100,99
		//û�п��Զ�ȡ���ֽڣ�����ֵΪ-1
		System.out.println(is.read(arr));//-1
		
	}
}
