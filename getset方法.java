package com.day06;

public class getset方法 {

	public static void main(String[] args) {
		People p = new People();
		p.setAge(21);
		p.setName("周口彭于晏");
		System.out.println(p.getName() + "...." + p.getAge());
	}

}
	class People {
		private String name;
		private int age;
		
		public String getName() {
			//定义一个方法,可以让外界访问到属性name
			return name;
		}
		public int getAge() {
		//定义一个方法,可以让外界访问到属性age
			return age;
		}
		public void setName (String n) {
			//定义一个方法,可以让外界修改name属性
			name = n;
			
		}
		public void setAge (int a) {
			//定义一个方法,可以让外界修改age属性
			age = a;
		}
		
	}