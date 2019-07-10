package com.day07;

public class 静态访问的注意事项 {
	String name = "周口彭于晏";
	int age = 22;
		public static void main(String[] args) {
			
			静态访问的注意事项  d = new 静态访问的注意事项();
			d.name = "王";
			System.out.println(d.name + "..." + d.age);
			d.test();
		}
		public void test() {
			System.out.println("注意事项");
		}

}
