package com.ujiuye.demos;

import java.util.Calendar;

public class Demo04_Calendar��add���� {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		c.set(Calendar.DATE, c.get(Calendar.DATE) + 3);
//		c.add(Calendar.DATE, 3);//�����ڶ�Ӧ��ֵ������3��
		c.add(Calendar.DATE, -5);
		Demo03_Calendar�е�set����.printCalendar(c);
		
		c.set(2019, 11, 31);
		c.add(Calendar.DATE, 1);
		Demo03_Calendar�е�set����.printCalendar(c);
	}
}
