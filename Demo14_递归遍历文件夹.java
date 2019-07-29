package com.ujiuye.demos;

import java.io.File;
import java.util.Scanner;

public class Demo14_递归遍历文件夹 {
	/**
	 * 键盘录入一个文件夹路径
		将该文件夹下所有的文件名称打印出来（包含子文件夹中的内容）
	 */
	public static void main(String[] args) {
		File dir = getDir();
		printDir(dir);
	}
	
	public static void printDir(File dir) {
		//获取当前文件夹下所有的文件和文件夹File对象
		File[] subFiles = dir.listFiles();
		//判断当前文件夹是否有访问权限
		if (subFiles != null) {
			//将该文件夹下的所有File对象一一遍历
			for (File file : subFiles) {
				if (file.isFile()) {//判断是否是文件，如果是文件
					//使用系统提供的方法，打印名称
					System.out.println(file.getAbsolutePath());
				} else {//如果不是文件，就是文件夹
					//说明file是一个文件夹，将该文件夹下的所有内容打印
					//使用递归的方式，调用自己定义的方法，打印文件夹的所有内容
					printDir(file);
				}
			}
		}
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请录入一个文件夹路径");
			String line = sc.nextLine();
			File dir = new File(line);
			if (dir.isDirectory()) {
				return dir;
			} else {
				System.out.println("录入非法，请重来");
			}
		}
	}

}
