package com.day06;

public class 类的创建 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "彭于晏";
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
			System.out.println("吃饭");
		}
		public void sleep () {
			System.out.println("睡觉");
		}
		public void drive () {
			System.out.println("开车");
		}
	}
	
	
