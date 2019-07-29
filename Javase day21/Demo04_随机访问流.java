package com.ujiuye.demos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo04_Ëæ»ú·ÃÎÊÁ÷ {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("rd.txt", "rw");
		/*raf.write('a');
		raf.write('b');
		raf.write('c');
		raf.write('d');
		raf.write('e');*/
		raf.seek(2);
		System.out.println(raf.read());
		raf.write('x');
		raf.seek(10);
		raf.write('q');
		raf.close();
	}

}
