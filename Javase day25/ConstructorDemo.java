package cn.offcn.reflect;

import java.lang.reflect.Constructor;

public class ConstructorDemo {
	
	public static void main(String[] args) throws Exception {
		
		//获取Class类的对象
		Class clazz=Person.class;
		Constructor cons=clazz.getConstructor(int.class);
		//创建带有一个整型构造方法
		Object obj=cons.newInstance(23);
		System.out.println(obj);
		
		Constructor cons1=clazz.getConstructor(String.class,int.class);
		Object obj2=cons1.newInstance("zhangsan",22);
		System.out.println(obj2);
		
		
	}

}
