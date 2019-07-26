package com.ujiuye.demos;

import java.io.File;

public class Demo04_File删除功能 {
	public static void main(String[] args) {
		//删除当前工程目录下的b/a.txt
		File a = new File("b/a.txt");
		a.delete();
		
		File aDir = new File("a");
		aDir.delete();
		
		File x = new File("x");
		x.delete();
	}
}
