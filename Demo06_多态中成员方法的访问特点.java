class Demo06_多态中成员方法的访问特点 {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.shout();

		Animal a1 = new Dog();
		a1.shout();
	}
}

class Animal {
	public void shout() {
		System.out.println("发声音叫");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("喵喵叫");
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("汪汪叫");
	}
}
