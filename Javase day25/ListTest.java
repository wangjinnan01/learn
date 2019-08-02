package cn.offcn.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) throws Exception{
	
		
		List<Integer> list=new ArrayList<>();
		list.add(123);
		//list.add("abc");
		//在编译创段，有类型检查，在生成的.class字节点文件中是没有泛型的，
		//如果在运行阶段，可以添加任何类型的数据。泛型擦除技术
		Class clazz=list.getClass();
		Method method=clazz.getMethod("add", Object.class);
		method.invoke(list, "abc");
		
		System.out.println(list);
	}

}
