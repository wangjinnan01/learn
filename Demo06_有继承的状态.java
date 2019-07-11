class Demo06_�м̳е�״̬ {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setColor("black");
		c.setAge(1);
		System.out.println(c.getColor() + "..." + c.getAge());
		c.eat();
		c.sleep();

		Dog d = new Dog();
		d.setColor("white");
		d.setAge(2);
		System.out.println(d.getColor() + "..." + d.getAge());
		d.eat();
		d.sleep();
	}
}

class Animal {
	private String color;
	private int age;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}

class Cat extends Animal {

}

class Dog extends Animal {

}
