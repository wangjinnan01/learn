class Demo05_��̬�г�Ա�����ķ����ص� {
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
