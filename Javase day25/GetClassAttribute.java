package cn.offcn.reflect;

import java.lang.reflect.Field;

public class GetClassAttribute {
	
	public static void main(String[] args) throws Exception {
		
		//��ȡPerson���Class��Ķ���
		Class clazz=Person.class;
		Field field=clazz.getField("name");
		//Person���һ������
		Object obj=clazz.newInstance();
		field.set(obj, "lisi");
		
	
		
		Field field2=clazz.getField("age");
		field2.set(obj, 20);
		
		System.out.println(obj);
		
		
	}

}
