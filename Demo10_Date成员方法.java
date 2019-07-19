package com.ujiuye.demos;

import java.util.Date;

public class Demo10_Date成员方法 {
	public static void main(String[] args) {
		Date d1 = new Date();
		for (int i = 1; i <= 999; i++) {
			System.out.print(" ");
		}
		System.out.println();
		Date d2 = new Date();
		System.out.println(d1.equals(d2));
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		
		Date d3 = new Date();
		d3.setTime(10000);
		System.out.println(d3);
		System.out.println(d3.getTime());
	}
}
