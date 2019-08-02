package cn.offcn.reflect;

import java.lang.reflect.Method;

public class ClassMethod {
	public static void main(String[] args) throws Exception {
		//获取Person类的Class类的对象
		Class clazz=Person.class;
		//调用Class类中的getMethod(String name, Class<?>... parameterTypes) 
		Method method=clazz.getMethod("setName", String.class);
		//在Method类中有一个invoke(Object obj, Object... args) 
		//获取Person对象
		Object obj=clazz.newInstance();
		method.invoke(obj, "赵六");
		System.out.println(obj);
		
		Method method2=clazz.getMethod("getName");
		Object  name=method2.invoke(obj);
		System.out.println(name);
	}

}
