package com.ujiuye.demos;

import java.io.File;

public class Demo06_File的判断功能 {
	public static void main(String[] args) {
		//判断qq是否是一个存在的路径
		File qq = new File("qq.txt");
		System.out.println(qq.exists());
		System.out.println(qq.isFile());
		System.out.println(qq.isDirectory());
		
		File c = new File("x/y/z/c.txt");
		System.out.println(c.isFile());
	}
}
