package com.ujiuye.demos;

import java.io.File;
import java.io.IOException;

//��D���µ�a/b/c/dĿ¼�£�����һ��e.txt�ļ�
public class Demo03_����������ϰ {
	public static void main(String[] args) throws IOException {
		File d = new File("D:/a/b/c/d");
		d.mkdirs();//�Ƚ�e.txt����Ŀ¼��������
		
		File e = new File(d, "e.txt");
		e.createNewFile();
	}
}
