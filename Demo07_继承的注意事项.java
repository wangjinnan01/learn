class Demo07_¼Ì³ÐµÄ×¢ÒâÊÂÏî {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class Animal {
	private String color;
	private int age;
	public int num;

	public Animal() {}

	public Animal(String color, int age) {
		this.color = color;
		this.age = age;
	}

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
		System.out.println("³Ô·¹");
	}

	public void sleep() {
		System.out.println("Ë¯¾õ");
	}
}

class Cat extends Animal {
	public void show() {
		System.out.println(num);
		System.out.println(getColor());
	}
}

class Dog extends Animal {
	private String job;

	public Dog() {}

	public Dog(String color, int age, String job) {
		//this.color = color;
		super(color, age);
		this.job = job;
	}
}