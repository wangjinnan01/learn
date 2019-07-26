package com.ujiuye.demos;

import java.io.File;

public class Demo01_File构造方法 {
	public static void main(String[] args) {
		//将D盘下a目录中的b目录中的c.txt封装成File对象
		File c = new File("D:/a/b/c.txt");
		System.out.println(c);
		File a = new File("b/a.txt");
		System.out.println(a);
		
		File a2 = new File("b", "a.txt");
		System.out.println(a2);
		
		File b = new File("b");
		File a3 = new File(b, "a.txt");
		System.out.println(a3);
	}
}
