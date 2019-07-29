package com.ujiuye.demos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo05_对象输出流 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.txt"));
		oos.writeObject(new Person("zhangsan", 23));
		oos.writeObject(new Person("lisi", 24));
		oos.close();
	}
}
