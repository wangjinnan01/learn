package com.ujiuye.demos;

import java.util.Scanner;

public class Demo04_ScannerС�����Լ���� {
	public static void main(String[] args) {
		test6_���ս����ʽ();
	}

	private static void test6_���ս����ʽ() {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		System.out.println(x + 1);
	}

	private static void test5_��������Scanner����() {
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		System.out.println(x);
		
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.nextLine();
		System.out.println(line);
	}

	private static void test4_������������nextLine() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		
		sc.nextLine();
		
		String line = sc.nextLine();
		System.out.println(line);
	}

	private static void test3_����¼������nextLine�����������() {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		System.out.println(line1);
		String line2 = sc.nextLine();
		System.out.println(line2);
	}

	private static void test2_����¼������int���������() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		int y = sc.nextInt();
		System.out.println(y);
	}

	private static void test1_С������ʾ() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		String line = sc.nextLine();
		System.out.println(line + "...");
	}
}
