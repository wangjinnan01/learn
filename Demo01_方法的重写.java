class Demo01_��������д {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.eat();
		stu.sleep();
		stu.study();
	}
}

class Person {
	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("ѧϰ");
	}

	@Override
	public void sleep() {
		System.out.println("ѧ��˯��˯����");
	}

	public void stuSleep() {
		System.out.println("ѧ��˯��˯����");
	}
}
