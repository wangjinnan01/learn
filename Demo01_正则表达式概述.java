package com.ujiuye.demos;

import java.util.Scanner;

public class Demo01_正则表达式概述 {
	public static void main(String[] args) {
		//键盘录入一个QQ号码，判断该QQ号码是否合法
		/*
		 * 1、5-15位
		 * 2、纯数字
		 * 3、不能以0开头
		 */
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		System.out.println(isQQValid(qq));
		System.out.println(isQQValidByRegex(qq));
	}
	
	public static boolean isQQValidByRegex(String qq) {
		return qq.matches("[1-9][0-9]{4,14}");
	}
	
	//定义一个方法，可以判断是否是合法的QQ号码
	public static boolean isQQValid(String qq) {
		if (!isLengthValid(qq)) {
			return false;
		}
		
		if (!isAllNum(qq)) {
			return false;
		}
		
		if (startsWith0(qq)) {
			return false;
		}
		
		return true;
	}

	private static boolean startsWith0(String qq) {
		return qq.startsWith("0");
	}

	private static boolean isAllNum(String qq) {
		char[] chs = qq.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			//如果某个字符，不满足在0-9之间，就说明不全是数字
			if (!(chs[i] >= '0' && chs[i] <= '9')) {
				return false;
			}
		}
		//如果循环结束了，还不能说明字符串是非纯数字
		return true;
		
	}

	private static boolean isLengthValid(String qq) {
		return qq.length() >= 5 && qq.length() <= 15;
	}
}
