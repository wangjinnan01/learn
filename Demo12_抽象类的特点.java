class Demo12_抽象类的特点 {
	public static void main(String[] args) {
		//Animal a = new Animal();抽象类不能创建对象
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();
		a.eat();
		a.test();
	}
}
//抽象类必须使用abstract关键字修饰
abstract class Animal {
	//抽象方法必须使用abstract修饰
	public abstract void eat();
	//抽象类中可以有非抽象方法
	public void test() {
		System.out.println(666);
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}
}
