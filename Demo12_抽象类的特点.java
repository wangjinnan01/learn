class Demo12_��������ص� {
	public static void main(String[] args) {
		//Animal a = new Animal();�����಻�ܴ�������
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();
		a.eat();
		a.test();
	}
}
//���������ʹ��abstract�ؼ�������
abstract class Animal {
	//���󷽷�����ʹ��abstract����
	public abstract void eat();
	//�������п����зǳ��󷽷�
	public void test() {
		System.out.println(666);
	}
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
