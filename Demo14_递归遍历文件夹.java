package com.ujiuye.demos;

import java.io.File;
import java.util.Scanner;

public class Demo14_�ݹ�����ļ��� {
	/**
	 * ����¼��һ���ļ���·��
		�����ļ��������е��ļ����ƴ�ӡ�������������ļ����е����ݣ�
	 */
	public static void main(String[] args) {
		File dir = getDir();
		printDir(dir);
	}
	
	public static void printDir(File dir) {
		//��ȡ��ǰ�ļ��������е��ļ����ļ���File����
		File[] subFiles = dir.listFiles();
		//�жϵ�ǰ�ļ����Ƿ��з���Ȩ��
		if (subFiles != null) {
			//�����ļ����µ�����File����һһ����
			for (File file : subFiles) {
				if (file.isFile()) {//�ж��Ƿ����ļ���������ļ�
					//ʹ��ϵͳ�ṩ�ķ�������ӡ����
					System.out.println(file.getAbsolutePath());
				} else {//��������ļ��������ļ���
					//˵��file��һ���ļ��У������ļ����µ��������ݴ�ӡ
					//ʹ�õݹ�ķ�ʽ�������Լ�����ķ�������ӡ�ļ��е���������
					printDir(file);
				}
			}
		}
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("��¼��һ���ļ���·��");
			String line = sc.nextLine();
			File dir = new File(line);
			if (dir.isDirectory()) {
				return dir;
			} else {
				System.out.println("¼��Ƿ���������");
			}
		}
	}

}
