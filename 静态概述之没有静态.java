package com.day07;

public class ��̬����֮û�о�̬ {

	public static void main(String[] args) {
		Actor a1 = new Actor();
		a1.name = "����ʦ";
		a1.country = "�ձ�";
		a1.act();
		Actor a2 = new Actor();
		a2.name = "С����ʦ";
		a2.country = "�ձ�";
		a2.act();
	}

}

	class Actor {
		String name;
		String country;
		public void act() {
			System.out.println(name + "..." + country);
		}
	}