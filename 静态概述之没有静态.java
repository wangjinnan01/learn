package com.day07;

public class 静态概述之没有静态 {

	public static void main(String[] args) {
		Actor a1 = new Actor();
		a1.name = "苍老师";
		a1.country = "日本";
		a1.act();
		Actor a2 = new Actor();
		a2.name = "小泽老师";
		a2.country = "日本";
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