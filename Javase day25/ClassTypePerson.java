package cn.offcn.reflect;

public class ClassTypePerson {

	
	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡPerson������Class��Ķ���
		//1.��֪������������
		Class clazz1=Person.class;
		
		//2.��֪������������ӵ��Person����
		Person p=new Person();
		Class clazz2=p.getClass();
		
		System.out.println(clazz1==clazz2);
		
		//3.֪ͨ������ȫ���޶�������+�ࣩ
		//cn.offcn.reflect.Person
		Class clazz3=Class.forName("cn.offcn.reflect.Person");
		System.out.println(clazz3==clazz2);
		
		//���ڻ����������͵ķ�װ���Class��Ķ��󻹿�����.TYPE����ȡ
		Integer it=new Integer(1);
		Class clazz=it.TYPE;
		
	}
	
	public static void createClass(String className) throws ClassNotFoundException {
		
		Class clazz=Class.forName(className);
	}
	
	
}
