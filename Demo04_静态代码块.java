class Demo04_静态代码块 {

	static {
		System.out.println("测试类的静态代码块执行了");//1
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("测试类的主方法执行了");//2
		Person p1 = new Person();
		p1.show();

		Person p2 = new Person("wang五", 25);
		p2.show();
	}
}

class Person {
	private String name = "lisi";
	private int age = 24;

	static {
		System.out.println("静态代码块执行了");//3
	}

	{
		name = "张三";
		age = 23;
		System.out.println("构造代码块被调用了");//4,7
	}

	public Person() {
		System.out.println("空参构造被调用了");//5
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造被调用了");//8
	}

	public void show() {
		System.out.println(name + "..." + age);//6,9
	}
}
