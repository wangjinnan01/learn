package cn.offcn.reflect;

public class ClassTypePerson {

	
	public static void main(String[] args) throws ClassNotFoundException {
		//获取Person这个类的Class类的对象
		//1.你知道这个类的类名
		Class clazz1=Person.class;
		
		//2.不知道类名，但是拥有Person对象
		Person p=new Person();
		Class clazz2=p.getClass();
		
		System.out.println(clazz1==clazz2);
		
		//3.通知这个类的全完限定名（包+类）
		//cn.offcn.reflect.Person
		Class clazz3=Class.forName("cn.offcn.reflect.Person");
		System.out.println(clazz3==clazz2);
		
		//对于基本数据类型的封装类的Class类的对象还可以用.TYPE来获取
		Integer it=new Integer(1);
		Class clazz=it.TYPE;
		
	}
	
	public static void createClass(String className) throws ClassNotFoundException {
		
		Class clazz=Class.forName(className);
	}
	
	
}
