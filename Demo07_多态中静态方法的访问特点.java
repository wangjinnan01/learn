class Demo07_��̬�о�̬�����ķ����ص� {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.shout();
	}
}

class Animal {
	public static void shout() {
		System.out.println("��������");
	}
}

class Cat extends Animal {
	@Override
	public static void shout() {
		System.out.println("������");
	}
}
