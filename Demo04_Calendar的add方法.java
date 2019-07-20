package com.ujiuye.demos;

import java.util.Calendar;

public class Demo04_Calendar的add方法 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		c.set(Calendar.DATE, c.get(Calendar.DATE) + 3);
//		c.add(Calendar.DATE, 3);//将日期对应的值，增大3天
		c.add(Calendar.DATE, -5);
		Demo03_Calendar中的set方法.printCalendar(c);
		
		c.set(2019, 11, 31);
		c.add(Calendar.DATE, 1);
		Demo03_Calendar中的set方法.printCalendar(c);
	}
}
