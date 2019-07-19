package com.ujiuye.demos;

public class Demo07_垃圾回收 {
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
		System.out.println("当前对象被当做垃圾回收了");
	}
}
