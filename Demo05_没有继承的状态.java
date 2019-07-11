class Demo05_Ã»ÓÐ¼Ì³ÐµÄ×´Ì¬ {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setColor("black");
		c.setAge(1);
		System.out.println(c.getColor() + "..." + c.getAge());
		c.eat();
		c.sleep();
	}
}

class Dog {
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
		System.out.println("³Ô·¹");
	}

	public void sleep() {
		System.out.println("Ë¯¾õ");
	}
}

class Cat {
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
		System.out.println("³Ô·¹");
	}

	public void sleep() {
		System.out.println("Ë¯¾õ");
	}
}
