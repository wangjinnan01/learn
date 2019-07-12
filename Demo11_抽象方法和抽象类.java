class Demo11_抽象方法和抽象类 {
	public static void main(String[] args) {
		//Animal a = new Animal();抽象类不能创建对象
		//a.eat();
	}
}

abstract class Animal {
	public abstract void eat();
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
