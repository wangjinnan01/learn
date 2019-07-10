package com.day07;

public class 静态概述之有静态 {

	public static void main(String[] args) {
		Actor1 a1 = new Actor1();
		a1.name = "苍老师";
		a1.country = "日本";
		a1.act();
		Actor1 a2 = new Actor1();
		a2.name = "小泽老师";
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