class Demo04_��̬����� {

	static {
		System.out.println("������ľ�̬�����ִ����");//1
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("�������������ִ����");//2
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("wang��", 25);
		p2.show();
	}
}

class Person {
	private String name = "lisi";
	private int age = 24;

	static {
		System.out.println("��̬�����ִ����");//3
	}

	{
		name = "����";
		age = 23;
		System.out.println("�������鱻������");//4,7
	}

	public Person() {
		System.out.println("�ղι��챻������");//5
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вι��챻������");//8
	}

	public void show() {
		System.out.println(name + "..." + age);//6,9
	}
}
