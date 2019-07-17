package com.ujiuye.demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo01_Scanner¸ÅÊö {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		System.out.println(x * x);
		
		Scanner sc2 = new Scanner("666");
		int y = sc2.nextInt();
		System.out.println(y + 1);
		
		Scanner sc3 = new Scanner(new File("D:/a.txt"));
		int z = sc3.nextInt();
		System.out.println(z);
	}
}
