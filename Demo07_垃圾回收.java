package com.ujiuye.demos;

public class Demo07_�������� {
	public static void main(String[] args) {
		/*for (int i = 1; i <= 559999; i++) {
			new Demo();
		}*/
		for (int i = 1; i <= 10; i++) {
			new Demo();
			System.gc();
		}
	}
}

class Demo {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ǰ���󱻵�������������");
	}
}
