package com.ujiuye.demos;

import java.io.File;
import java.io.IOException;

public class Demo02_File�Ĵ������� {
	public static void main(String[] args) throws IOException {
		File c = new File("b/c.txt");
		c.createNewFile();
		
		File a = new File("a");
		a.mkdir();
		
		//��ǰ�����£�����һ��x/y/zĿ¼
		File z = new File("x/y/z");
		z.mkdirs();
	}
}
