package cn.offcn.reflect;

import java.lang.reflect.Field;

public class ClassFieldTest {
	
	public static void main(String[] args) throws Exception{
		
		//����Person���Class�����
		Class clazz=Person.class;
		Field field=clazz.getDeclaredField("name");
		//����һ��Person����
		Object obj=clazz.newInstance();
		//���Է��ʿ��Ʒ�
		field.setAccessible(true);
		field.set(obj, "wangwu");
		System.out.println(obj);
	}

}
