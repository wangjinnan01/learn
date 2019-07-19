package com.ujiuye.demos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo11_SimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();//默认的格式
		System.out.println(sdf);
		System.out.println(sdf.format(d));
		
		//2019 07 18; 17:05:39
		//yyyy MM dd; kk:mm:ss
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MM dd; kk:mm:ss");
		System.out.println(sdf2.format(d));
		
		//键盘录入字符串，获取该时间的毫秒值
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个字符串，计算该字符串表示的时间的毫秒值，字符串格式如：2019-09-01 00:00:00");
		String timeStr = sc.nextLine();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date result = sdf3.parse(timeStr);
		System.out.println(result.getTime());
	}
}
