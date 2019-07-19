package com.ujiuye.demos;

import java.util.Scanner;

public class Demo01_������ʽ���� {
	public static void main(String[] args) {
		//����¼��һ��QQ���룬�жϸ�QQ�����Ƿ�Ϸ�
		/*
		 * 1��5-15λ
		 * 2��������
		 * 3��������0��ͷ
		 */
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		System.out.println(isQQValid(qq));
		System.out.println(isQQValidByRegex(qq));
	}
	
	public static boolean isQQValidByRegex(String qq) {
		return qq.matches("[1-9][0-9]{4,14}");
	}
	
	//����һ�������������ж��Ƿ��ǺϷ���QQ����
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
			//���ĳ���ַ�����������0-9֮�䣬��˵����ȫ������
			if (!(chs[i] >= '0' && chs[i] <= '9')) {
				return false;
			}
		}
		//���ѭ�������ˣ�������˵���ַ����ǷǴ�����
		return true;
		
	}

	private static boolean isLengthValid(String qq) {
		return qq.length() >= 5 && qq.length() <= 15;
	}
}
