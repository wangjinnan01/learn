package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo08_序列化版本号的问题 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ver.txt"));
		Object obj = ois.readObject();
		System.out.println(obj);
		ois.close();
//		test1_写对象();
	}

	private static void test1_写对象() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ver.txt"));
		oos.writeObject(new Person("wangwu", 25));
		oos.close();
	}
}
