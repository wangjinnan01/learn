package cn.offcn.reflect;

import java.lang.reflect.Method;

public class ClassMethod {
	public static void main(String[] args) throws Exception {
		//��ȡPerson���Class��Ķ���
		Class clazz=Person.class;
		//����Class���е�getMethod(String name, Class<?>... parameterTypes) 
		Method method=clazz.getMethod("setName", String.class);
		//��Method������һ��invoke(Object obj, Object... args) 
		//��ȡPerson����
		Object obj=clazz.newInstance();
		method.invoke(obj, "����");
		System.out.println(obj);
		
		Method method2=clazz.getMethod("getName");
		Object  name=method2.invoke(obj);
		System.out.println(name);
	}

}
