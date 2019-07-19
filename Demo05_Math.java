package com.ujiuye.demos;

public class Demo05_Math {
	public static void main(String[] args) {
		System.out.println(Math.abs(-666));
		System.out.println(Math.cbrt(-8));
		System.out.println(Math.sqrt(-100));
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(-12.34));
		
		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(-12.34));
		
		System.out.println(Math.round(22.49));
		System.out.println(Math.round(22.50));
		
		System.out.println(Math.round(-22.49));
		System.out.println(Math.round(-22.50));
		System.out.println(Math.round(-22.51));
		
		System.out.println(Math.pow(1.01, 365));
		System.out.println(Math.pow(1.02, 365));
		
		System.out.println(Math.pow(0.99, 365));
		System.out.println(Math.pow(0.98, 365));
		
		System.out.println(Math.random());//0.00000~0.999999
		
		System.out.println(Math.round(2147483648.8F));
		System.out.println(Math.ceil(2147483648.8));
	}
}
