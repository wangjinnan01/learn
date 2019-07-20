package com.ujiuye.demos;

import java.util.Calendar;
import java.util.Scanner;

public class Demo05_平年闰年判断 {
	public static void main(String[] args) {
		//录入一个年份，判断平年还是闰年
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//将Calendar对象设定为该年份的12月31日，判断是该年份的第365还是366天
		Calendar c = Calendar.getInstance();
		c.set(year, 11, 31);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		if (dayOfYear == 366) {
			System.out.println("闰年");
		} else {
			System.out.println("平年");
		}
	}
}
