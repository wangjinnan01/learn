package com.ujiuye.demos;

import java.io.File;
import java.io.IOException;

//在D盘下的a/b/c/d目录下，创建一个e.txt文件
public class Demo03_创建功能练习 {
	public static void main(String[] args) throws IOException {
		File d = new File("D:/a/b/c/d");
		d.mkdirs();//先将e.txt所在目录创建出来
		
		File e = new File(d, "e.txt");
		e.createNewFile();
	}
}
