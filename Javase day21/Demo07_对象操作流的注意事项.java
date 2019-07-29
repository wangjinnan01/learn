package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo07_�����������ע������ {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pers.txt"));
		ArrayList<Person> pers = (ArrayList<Person>)(ois.readObject());
		ois.close();
		for (Person person : pers) {
			System.out.println(person);
		}
	}

	private static void test1_ʹ�ü��ϴ洢���ļ���() throws IOException, FileNotFoundException {
		ArrayList<Person> pers = new ArrayList<>();
		pers.add(new Person("zhangsan", 23));
		pers.add(new Person("lisi", 24));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pers.txt"));
		oos.writeObject(pers);
		oos.close();
	}
}
