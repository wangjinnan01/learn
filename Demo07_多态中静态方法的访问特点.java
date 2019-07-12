class Demo07_多态中静态方法的访问特点 {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.shout();
	}
}

class Animal {
	public static void shout() {
		System.out.println("出声音叫");
	}
}

class Cat extends Animal {
	@Override
	public static void shout() {
		System.out.println("喵喵叫");
	}
}
