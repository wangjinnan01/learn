package com.day06;

public class 方法的形式参数是引用类型 {

	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		updataCar(c);
		c.run();
	}
	public static void updataCar (Car c ) {
		c.color = "red";
		c.num = 6;
	}
}
	
		
	
