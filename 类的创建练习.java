package com.day06;

public class ��Ĵ�����ϰ {
//	����һ�������࣬����ɫ��color��������̥������num�����ܣ�run�����ܣ�run���ܣ�������ʾ��ǰ������ɫ�͵�ǰ��������̥������
//	�ڲ������У��������������޸���������ɫ����̥����������run��������ʾ������ɫ����̥����
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "��ɫ";
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
