class Demo13_抽象类的成员特点 {
	public static void main(String[] args) {
		Cat c = new Cat("white", 1);

	}
}

abstract class Animal {
	//可以定义成员变量
	private String color;
	private int age;
	//可以定义常量
	public static final boolean isLive = true;
	//有构造方法
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
