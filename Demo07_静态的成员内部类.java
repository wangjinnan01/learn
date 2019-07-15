class Demo07_静态的成员内部类 {
	public static void main(String[] args) {
		Body.Gan bg = new Body.Gan();
		bg.speak();

		//Body.Gan.speak();
	}
}

class Body {
	private static int height = 149;

	static class Gan {
		String color = "black";

		public void speak() {
			System.out.println("老大别喝了，实在受不了了。。" + height + "..." + color);
		}
	}

	public static void test() {}
}
