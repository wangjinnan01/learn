class Demo11_���󷽷��ͳ����� {
	public static void main(String[] args) {
		//Animal a = new Animal();�����಻�ܴ�������
		//a.eat();
	}
}

abstract class Animal {
	public abstract void eat();
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}
}
