package com.ujiuye.demos;

import java.io.File;

public class Demo07_File中的获取功能 {
	public static void main(String[] args) {
		File c = new File("x/y/z/c.txt");
		System.out.println(c.getAbsolutePath());
		
		System.out.println(c.getPath());
		
		System.out.println(c.getName());
		
		System.out.println(c.length());
		
		File z = new File("x/y/z");
		System.out.println(z.length());
		
		String[] names = z.list();
		for (String name : names) {
			System.out.println(name);
		}
		
		File[] files = z.listFiles();
		for (File file : files) {
			System.out.println(file.getAbsolutePath() + "..." + file.isFile());
		}
		
		System.out.println("==========================");
		File d = new File("D:/");
		String[] paths = d.list();
		for (String path : paths) {
			System.out.println(path);
		}
		
		File[] subFiles = d.listFiles();
		for (File subFile : subFiles) {
			System.out.println(subFile.getAbsolutePath() + "..." + subFile.isFile());
		}
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println(c.listFiles());;
	}
}
