package com.ujiuye.demos;

public class Demo03_Ԥ�����ַ��� {
	public static void main(String[] args) {
		String regex = "\\d";
		System.out.println("abc996".matches("abc\\d9\\d"));
		
		String regex1 = "\\D";
		System.out.println("abc996".matches("\\D\\Dc\\d\\d6\\D"));
		
		
	}

	private static void test2_dot() {
		String regex = "\\.";//���һ����ͨ��.
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("#".matches(regex));
		System.out.println(".".matches(regex));
		System.out.println(" ".matches(regex));
		System.out.println("".matches(regex));
		/*System.out.println("\"");
		System.out.println('\'');
		System.out.println("\\");*/
	}

	private static void test1_dot() {
		String regex = ".";
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("#".matches(regex));
		System.out.println(".".matches(regex));
		System.out.println(" ".matches(regex));
		System.out.println("".matches(regex));
	}
}
