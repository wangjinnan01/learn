package cn.offcn.demo;

import java.util.function.Consumer;

public class MethodUse {
	
	public static void main(String[] args) {
		
		Consumer<Integer> c1= x-> System.out.println(x);
		c1.accept(100);
		
		Consumer<Integer> c2= System.out::println;
		c2.accept(300);
		
		TestDemo td=new TestDemo();
		//td.print(9);
		
		//Consumer<Integer> c3=x-> System.out.println(x*x);
		Consumer<Integer> c3=td::print;
		c3.accept(8);
		
		Consumer<Integer> c4=TestDemo::prints;
		c4.accept(5);
	}

}

class TestDemo{
	
	/**
	 * 打印一个整型数的平方
	 * @param x
	 */
	public void print(int x) {
		System.out.println(x*x);
	}
	
	public static void prints(int x) {
		System.out.println(x*x);
	}
}
