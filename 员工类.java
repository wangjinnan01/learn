package com.day08;

public class Ա���� {
	/*1������Ա�����ԣ����������š����ʣ�����Ϊ���ô��룩
	2����Ŀ�������ԣ����������š����ʡ����𣩡���Ϊ����Ŀ���ȿ���*/
	public static void main(String[] args) {
		Coder c = new Coder("�ܿ�������", "00667876", 12000);
		c.play();
		System.out.println(c.getName() + "..." + "..." + c.getId() + "..." + c.getSalary());
		Manager j = new Manager("������", "0982389", 120000,2000);
		j.play();
		System.out.println(j.getName() + "..." + "..." + j.getId() + "..." + j.getSalary() + "..." + j.getBonus());
		
	}

}
	class Employee {
		private String name;
		private String id;
		private double salary;
		public Employee() {}
		public Employee(String name,String id,double salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}
		public void setName(String name) {
				this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setId (String id) {
			this.id = id;
		}
		public String getId () {
			return id;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getSalary() {
			return salary;
		}
	}
		
	class Coder extends Employee {
		public Coder(String name, String id, double salary) {
			super(name, id, salary);
			
		}
		public void play() {
			System.out.println("�ô���");
		}
	}
	class Manager extends Employee{
		private double bonus;
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		public double getBonus() {
			return bonus;
		}
		public Manager () {}
		public Manager(String name, String id, double salary,double bonus) {
			super(name, id, salary);
			this.bonus = bonus;
			
		}

		public void play() {
			System.out.println("��Ŀ���ȿ���");
		}
	}