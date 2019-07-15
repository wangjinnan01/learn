class Demo06_私有的成员内部类 {
	public static void main(String[] args) {
		Body b = new Body();
		b.show();
	}
}

class Body {
	private int height = 149;

	private class Shen {
		int age = 40;

		public void speak() {
			System.out.println("该找heart的时候别总找我。。" + height + "..." + age);
		}
	}
	
	public void show() {
		Shen s = new Shen();
		s.speak();
	}
}
