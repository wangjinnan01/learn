package com.ujiuye.demos;

import java.util.Calendar;

public class Demo03_Calendar中的set方法 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 31);
		printCalendar(c);
		c.set(Calendar.DATE, -1);
		printCalendar(c);
		
		c.set(2000, 11, 31);
		printCalendar(c);
		
	}
	
	public static void printCalendar(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "..." + month + "..." + date + "..." + hour + "..." + minute + "..." + second);
	}
}
