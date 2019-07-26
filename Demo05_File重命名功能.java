package com.ujiuye.demos;

import java.io.File;

public class Demo05_File重命名功能 {
	public static void main(String[] args) {
		test2_重命名();
	}

	private static void test2_重命名() {
		File b = new File("b");
		File qq = new File("qq");
		
		b.renameTo(qq);
	}

	private static void test1_剪切() {
		File b = new File("b");
		File z = new File("x/y/z");
		
		//被移动的文件c.txt
		File c = new File(b, "c.txt");
		//移动之后的文件的路径
		File c2 = new File(z, "c.txt");
		
		c.renameTo(c2);
	}
}
