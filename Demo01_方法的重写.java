class Demo01_方法的重写 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.eat();
		stu.sleep();
		stu.study();
	}
}

class Person {
	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("学习");
	}

	@Override
	public void sleep() {
		System.out.println("学生睡觉睡不够");
	}

	public void stuSleep() {
		System.out.println("学生睡觉睡不够");
	}
}
