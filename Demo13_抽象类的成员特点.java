class Demo13_������ĳ�Ա�ص� {
	public static void main(String[] args) {
		Cat c = new Cat("white", 1);

	}
}

abstract class Animal {
	//���Զ����Ա����
	private String color;
	private int age;
	//���Զ��峣��
	public static final boolean isLive = true;
	//�й��췽��
	public Animal() {}

	public Animal(String color, int age) {
		this.color = color;
		this.age = age;
	}
}

class Cat extends Animal {

	public Cat() {}

	public Cat(String color, int age) {
		super(color, age);
	}
}
