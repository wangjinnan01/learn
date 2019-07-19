package com.ujiuye.demos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo11_SimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();//Ĭ�ϵĸ�ʽ
		System.out.println(sdf);
		System.out.println(sdf.format(d));
		
		//2019 07 18; 17:05:39
		//yyyy MM dd; kk:mm:ss
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MM dd; kk:mm:ss");
		System.out.println(sdf2.format(d));
		
		//����¼���ַ�������ȡ��ʱ��ĺ���ֵ
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼��һ���ַ�����������ַ�����ʾ��ʱ��ĺ���ֵ���ַ�����ʽ�磺2019-09-01 00:00:00");
		String timeStr = sc.nextLine();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date result = sdf3.parse(timeStr);
		System.out.println(result.getTime());
	}
}
