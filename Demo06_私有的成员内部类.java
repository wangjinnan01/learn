class Demo06_˽�еĳ�Ա�ڲ��� {
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
			System.out.println("����heart��ʱ��������ҡ���" + height + "..." + age);
		}
	}
	
	public void show() {
		Shen s = new Shen();
		s.speak();
	}
}
