package com.ujiuye.demos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo10_OutputStream {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("b.txt");
		os.write(97);
		os.write(98);
		
		byte[] arr1 = {99, 100, 101};
		os.write(arr1);
		
		byte[] arr2 = {102, 103, 104, 105};
		os.write(arr2, 0, 2);
		
	}
}
