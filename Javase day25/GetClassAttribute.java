package cn.offcn.reflect;

import java.lang.reflect.Field;

public class GetClassAttribute {
	
	public static void main(String[] args) throws Exception {
		
		//获取Person类的Class类的对象
		Class clazz=Person.class;
		Field field=clazz.getField("name");
		//Person类的一个对象
		Object obj=clazz.newInstance();
		field.set(obj, "lisi");
		
	
		
		Field field2=clazz.getField("age");
		field2.set(obj, 20);
		
		System.out.println(obj);
		
		
	}

}
