package com.ujiuye.demos;

public class Demo11_自动装箱和拆箱 {
	public static void main(String[] args) {
		test2_自动装箱和拆箱();
		
	}

	private static void test2_自动装箱和拆箱() {
		//自动装箱
		Integer it = 100;
		
		//自动拆箱
		int i = it;
		System.out.println(i);
		
		
		Integer itg = 10;//自动装箱
		itg = itg + 1;//先自动拆箱，获取到int值，计算，将结果自动装箱
		
		Integer inte = null;
		//int k = inte;不能使用null进行自动拆箱
	}

	private static void test1_装箱和拆箱() {
		int i = 10;
		//装箱
		Integer it = new Integer(i);
		//拆箱
		int j = it.intValue();
	}
}
