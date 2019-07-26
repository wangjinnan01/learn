package com.ujiuye.demos;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo11_FileOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("b.txt");
//		fos.write(65);
		FileOutputStream fosa = new FileOutputStream("a.txt", true);
		fosa.write(65);
	}
}
