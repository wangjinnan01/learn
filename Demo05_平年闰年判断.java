package com.ujiuye.demos;

import java.util.Calendar;
import java.util.Scanner;

public class Demo05_ƽ�������ж� {
	public static void main(String[] args) {
		//¼��һ����ݣ��ж�ƽ�껹������
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//��Calendar�����趨Ϊ����ݵ�12��31�գ��ж��Ǹ���ݵĵ�365����366��
		Calendar c = Calendar.getInstance();
		c.set(year, 11, 31);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		if (dayOfYear == 366) {
			System.out.println("����");
		} else {
			System.out.println("ƽ��");
		}
	}
}
