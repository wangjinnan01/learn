package com.day07;

public class 构造方法 {

	public static void main(String[] args) {
		
		Person1 p = new Person1();
		System.out.println(p.getName() + "..." + p.getAge());
		Person1 p2 = new Person1("周口吴彦祖",22);
		System.out.println(p2.getName() + "..." + p2.getAge());
		
	}

}
	class Person1 {
		private String name;
		private int age;
		public Person1() {
			System.out.println("我是构造方法,我被调用了");
			name = "周口彭于晏";
			age = 22;
		}
		public Person1 (String name ,int age) {
			System.out.println("我是有参构造方法,我被调用了");
			this.name = name;
			this.age = age;
			
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
	}