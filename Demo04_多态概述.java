class Demo04_��̬���� {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.shout();
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
