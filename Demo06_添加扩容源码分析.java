package com.ujiuye.demos;

public class Demo06_�������Դ����� {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//16
		sb.append("abcd");
		System.out.println(sb.capacity());//16
		sb.append("abcd");
		System.out.println(sb.capacity());//16
		sb.append("abcdabcd");//16��
//		sb.append("mnpwxyzmnpwxyzmnpwxyz");
		sb.append("abcdabcdabcdabcdxyz");
		System.out.println(sb.capacity());
		sb.append("z");
		System.out.println(sb.capacity());
	}

}
