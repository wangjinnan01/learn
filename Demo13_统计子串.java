package com.ujiuye.demos;
//�������ַ���abcdxyxydcba�ַ����У��ж��ٸ�xy�ַ���
public class Demo13_ͳ���Ӵ� {

	public static void main(String[] args) {
		String str = "abcdxyxydcba";
		String subStr = "xy";
		
		String result = str.replace(subStr, "");
		
		System.out.println((str.length() - result.length()) / subStr.length());
	}
}
