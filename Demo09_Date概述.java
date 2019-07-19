package com.ujiuye.demos;

import java.util.Date;

public class Demo09_Date¸ÅÊö {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println(d2);
		
		Date d3 = new Date(0);
		System.out.println(d3);
	}

}
