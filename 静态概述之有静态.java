package com.day07;

public class ��̬����֮�о�̬ {

	public static void main(String[] args) {
		Actor1 a1 = new Actor1();
		a1.name = "����ʦ";
		a1.country = "�ձ�";
		a1.act();
		Actor1 a2 = new Actor1();
		a2.name = "С����ʦ";
		a2.act();
	}

}
	class Actor1 {
		String name;
		static String country;
		public void act() {
			System.out.println(name + "..." + country);
		}
	}