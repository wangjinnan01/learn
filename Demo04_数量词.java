package com.ujiuye.demos;

public class Demo04_数量词 {
	public static void main(String[] args) {
		
	}

	private static void test2_精确数量词() {
		String regex = "[abc]{2,4}666{2}\\s{3}";
		System.out.println("abc6666 	\n".matches(regex));
	}

	private static void test1_模糊数量词() {
		String regex = "ab[xyz]?\\d*\\W+[ABC].+";
		System.out.println("abc123ababC666".matches(regex));
		System.out.println("ab*** A666".matches(regex));
	}
}
