package com.ujiuye.demos;

import java.io.File;

public class Demo06_File���жϹ��� {
	public static void main(String[] args) {
		//�ж�qq�Ƿ���һ�����ڵ�·��
		File qq = new File("qq.txt");
		System.out.println(qq.exists());
		System.out.println(qq.isFile());
		System.out.println(qq.isDirectory());
		
		File c = new File("x/y/z/c.txt");
		System.out.println(c.isFile());
	}
}
