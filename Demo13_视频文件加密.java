package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo13_视频文件加密 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a_copy.wmv");
		FileOutputStream fos = new FileOutputStream("a_jm.wmv");
		int b;
		while ((b = fis.read()) != -1) {
			b = ~b;
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
