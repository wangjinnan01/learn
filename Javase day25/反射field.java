package cn.offcn.reflect;

import java.lang.reflect.Field;

public class ClassFieldTest {
	
	public static void main(String[] args) throws Exception{
		
		//创建Person类的Class类对象
		Class clazz=Person.class;
		Field field=clazz.getDeclaredField("name");
		//创建一个Person对象
		Object obj=clazz.newInstance();
		//忽略访问控制符
		field.setAccessible(true);
		field.set(obj, "wangwu");
		System.out.println(obj);
	}

}
