package com.day06;

public class ��Ĵ��� {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "������";
		p.age = 23;
		p.gender = "mm";
		p.drive();
		p.eat();
		p.sleep();
		System.out.println(p.name + "......" + p.gender+ "......" + p.age);
	}

}
	class Person {
		String name;
		int age ;
		String gender;
		public void eat() {
			System.out.println("�Է�");
		}
		public void sleep () {
			System.out.println("˯��");
		}
		public void drive () {
			System.out.println("����");
		}
	}
	
	
