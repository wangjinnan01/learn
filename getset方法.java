package com.day06;

public class getset���� {

	public static void main(String[] args) {
		People p = new People();
		p.setAge(21);
		p.setName("�ܿ�������");
		System.out.println(p.getName() + "...." + p.getAge());
	}

}
	class People {
		private String name;
		private int age;
		
		public String getName() {
			//����һ������,�����������ʵ�����name
			return name;
		}
		public int getAge() {
		//����һ������,�����������ʵ�����age
			return age;
		}
		public void setName (String n) {
			//����һ������,����������޸�name����
			name = n;
			
		}
		public void setAge (int a) {
			//����һ������,����������޸�age����
			age = a;
		}
		
	}