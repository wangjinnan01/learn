package com.ujiuye.demos;

import java.io.File;

public class Demo01_File���췽�� {
	public static void main(String[] args) {
		//��D����aĿ¼�е�bĿ¼�е�c.txt��װ��File����
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
