package cn.offcn.reflect;

public class CreatePersonObject {
	
	public static void main(String[] args) throws Exception {
		
		//��ȡPerson���Class��Ķ���
		Class<Person> clazz=Person.class;
		//����Class������������Ǹ���Ķ���
		Person p=clazz.newInstance();  
		//newInstance()��Class��������������б�����һ���޲ι��췽��
		p.setAge(22);
		System.out.println(p);
	}

}
