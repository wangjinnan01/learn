package com.day06;

public class 方法的返回值类型是引用类型 {

	public static void main(String[] args) {
		Car c = createCar();
		c.run();
		
	}
	public static Car createCar( ) {
		Car c2 = new Car();
		c2.color = "red";
		c2.num = 1;
		return c2;
	}
}
