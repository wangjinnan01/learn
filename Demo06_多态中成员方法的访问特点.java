class Demo06_��̬�г�Ա�����ķ����ص� {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.shout();

		Animal a1 = new Dog();
		a1.shout();
	}
}

class Animal {
	public void shout() {
		System.out.println("��������");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("������");
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("������");
	}
}
