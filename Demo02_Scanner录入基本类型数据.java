package com.ujiuye.demos;

import java.util.Scanner;

public class Demo02_Scanner录入基本类型数据 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();
		System.out.println(b);
		
		short s = sc.nextShort();
		System.out.println(s);
		
		int i = sc.nextInt();
		System.out.println(i);
		
		long g = sc.nextLong();
		System.out.println(g);
		
		float f = sc.nextFloat();
		System.out.println(f);
		
		double d = sc.nextDouble();
		System.out.println(d);
		
		boolean bo = sc.nextBoolean();
		System.out.println(bo);
	}
}
