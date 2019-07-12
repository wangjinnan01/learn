class Demo09_多态的好处 {
	public static void main(String[] args) {
		Cat c = new Cat();
		play(c);

		Dog d = new Dog();
		play(d);

		Animal a = new Cat();
		a.play();
	}

	//形式参数为父类，所有子类对象都可以作为实际参数
	public static void play(Animal a) {//Animal a = new Cat(); Animal a = new Dog();
		a.play();
	}
}

class Animal {
	public void play() {
		
	}
}

class Cat extends Animal {
	public void play() {
		System.out.println("吃手手");
	}
}

class Dog extends Animal {
	public void play() {
		System.out.println("摇尾巴");
	}
}
