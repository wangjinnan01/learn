package com.ujiuye.demos;

public class Demo04_������ {
	public static void main(String[] args) {
		
	}

	private static void test2_��ȷ������() {
		String regex = "[abc]{2,4}666{2}\\s{3}";
		System.out.println("abc6666 	\n".matches(regex));
	}

	private static void test1_ģ��������() {
		String regex = "ab[xyz]?\\d*\\W+[ABC].+";
		System.out.println("abc123ababC666".matches(regex));
		System.out.println("ab*** A666".matches(regex));
	}
}
