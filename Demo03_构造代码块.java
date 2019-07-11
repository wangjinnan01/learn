class Demo03_构造代码块 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("wang五", 25);
		p2.show();
	}
}

class Person {
	private String name = "lisi";
	private int age = 24;

	{
		name = "张三";
		age = 23;
		System.out.println("构造代码块被调用了");
	}

	public Person() {
		System.out.println("空参构造被调用了");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造被调用了");
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}
