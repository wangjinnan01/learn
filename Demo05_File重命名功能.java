package com.ujiuye.demos;

import java.io.File;

public class Demo05_File���������� {
	public static void main(String[] args) {
		test2_������();
	}

	private static void test2_������() {
		File b = new File("b");
		File qq = new File("qq");
		
		b.renameTo(qq);
	}

	private static void test1_����() {
		File b = new File("b");
		File z = new File("x/y/z");
		
		//���ƶ����ļ�c.txt
		File c = new File(b, "c.txt");
		//�ƶ�֮����ļ���·��
		File c2 = new File(z, "c.txt");
		
		c.renameTo(c2);
	}
}
