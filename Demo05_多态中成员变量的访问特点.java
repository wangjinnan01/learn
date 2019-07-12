class Demo05_多态中成员变量的访问特点 {
	public static void main(String[] args) {
		Animal a = new Cat();
		System.out.println(a.age);
	}
}

class Animal {
	int age = 3;
}

class Cat extends Animal {
	int age = 4;
}
