class Demo03_�������� {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("wang��", 25);
		p2.show();
	}
}

class Person {
	private String name = "lisi";
	private int age = 24;

	{
		name = "����";
		age = 23;
		System.out.println("�������鱻������");
	}

	public Person() {
		System.out.println("�ղι��챻������");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вι��챻������");
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}
