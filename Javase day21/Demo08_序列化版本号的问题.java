package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo08_���л��汾�ŵ����� {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ver.txt"));
		Object obj = ois.readObject();
		System.out.println(obj);
		ois.close();
//		test1_д����();
	}

	private static void test1_д����() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ver.txt"));
		oos.writeObject(new Person("wangwu", 25));
		oos.close();
	}
}
