package cn.offcn.reflect;

public class CreatePersonObject {
	
	public static void main(String[] args) throws Exception {
		
		//获取Person类的Class类的对象
		Class<Person> clazz=Person.class;
		//创建Class对像，所代表的那个类的对象
		Person p=clazz.newInstance();  
		//newInstance()，Class对象所代表的类中必须有一个无参构造方法
		p.setAge(22);
		System.out.println(p);
	}

}
