package com.day06;

public class 类的创建练习 {
//	定义一个汽车类，有颜色（color）、有轮胎个数（num），跑（run）功能，run功能（用于显示当前汽车颜色和当前汽车的轮胎个数）
//	在测试类中，创建汽车对象，修改汽车的颜色和轮胎个数，调用run方法，显示汽车颜色和轮胎个数
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "红色";
		c.num = 4;
		c.run();
		System.out.println("-----------");
		Car c1 = c;
		c1.num = 8;
		c.run();
		c1.run();
		System.out.println('\u0000');
		
	}

}
	class Car {
		String color ;
		int num ;
		
		public void run () {
			System.out.println(color + "...." + num );
		}
	}
