class Demo07_��̬�ĳ�Ա�ڲ��� {
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
			System.out.println("�ϴ����ˣ�ʵ���ܲ����ˡ���" + height + "..." + color);
		}
	}

	public static void test() {}
}
