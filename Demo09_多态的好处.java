class Demo09_��̬�ĺô� {
	public static void main(String[] args) {
		Cat c = new Cat();
		play(c);

		Dog d = new Dog();
		play(d);

		Animal a = new Cat();
		a.play();
	}

	//��ʽ����Ϊ���࣬����������󶼿�����Ϊʵ�ʲ���
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
		System.out.println("������");
	}
}

class Dog extends Animal {
	public void play() {
		System.out.println("ҡβ��");
	}
}
