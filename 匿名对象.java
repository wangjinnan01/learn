package com.day06;

public class ÄäÃû¶ÔÏó {

	public static void main(String[] args) {
		Car c = createCar();
		c.color = "red";
		c.num = 12;
		c.run();
	}
	public static Car createCar() {
		return new Car();
	}
}
