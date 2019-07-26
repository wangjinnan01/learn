package com.ujiuye.demos;

import java.io.File;
import java.io.IOException;

public class Demo02_File的创建功能 {
	public static void main(String[] args) throws IOException {
		File c = new File("b/c.txt");
		c.createNewFile();
		
		File a = new File("a");
		a.mkdir();
		
		//当前工程下，创建一个x/y/z目录
		File z = new File("x/y/z");
		z.mkdirs();
	}
}
