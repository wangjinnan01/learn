package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo06_���������� {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//��ȡperson.txt�е�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"));
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		ois.close();
	}
}
