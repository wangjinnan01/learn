package cn.offcn.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) throws Exception{
	
		
		List<Integer> list=new ArrayList<>();
		list.add(123);
		//list.add("abc");
		//�ڱ��봴�Σ������ͼ�飬�����ɵ�.class�ֽڵ��ļ�����û�з��͵ģ�
		//��������н׶Σ���������κ����͵����ݡ����Ͳ�������
		Class clazz=list.getClass();
		Method method=clazz.getMethod("add", Object.class);
		method.invoke(list, "abc");
		
		System.out.println(list);
	}

}
