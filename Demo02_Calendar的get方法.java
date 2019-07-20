package com.ujiuye.demos;

import java.util.Calendar;

public class Demo02_CalendarµÄget·½·¨ {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		/*System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		System.out.println(c.get(4));
		System.out.println(c.get(5));
		System.out.println(c.get(6));*/
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
	}
}
