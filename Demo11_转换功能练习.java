package com.ujiuye.demos;

import java.util.Scanner;

/**
* 		����¼��һ����Ӣ���ַ���
		����ת��֮��
		�������ַ�����Ҫ������ĸ��д��������ĸ��Сд
 * @author Administrator
 *
 */
public class Demo11_ת��������ϰ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		
		String str1 = line.substring(0, 1).toUpperCase();//����ĸ��д
		String str2 = line.substring(1).toLowerCase();//������ĸСд
		String result = str1.concat(str2);
		System.out.println(result);
		
		//��ʽ��̣���һ�������ķ���ֵ���������һ��������ô�Ϳ��Լ������÷��صĶ���ķ���
		String result2 = line.substring(0, 1).toUpperCase().concat(line.substring(1).toLowerCase());
	}
}
