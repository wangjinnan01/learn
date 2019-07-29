package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo06_对象输入流 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//读取person.txt中的内容
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"));
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		ois.close();
	}
}
