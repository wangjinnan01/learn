package com.ujiuye.demos;

import java.io.File;

public class Demo04_Fileɾ������ {
	public static void main(String[] args) {
		//ɾ����ǰ����Ŀ¼�µ�b/a.txt
		File a = new File("b/a.txt");
		a.delete();
		
		File aDir = new File("a");
		aDir.delete();
		
		File x = new File("x");
		x.delete();
	}
}
