class Demo05_普通成员内部类 {
	public static void main(String[] args) {
		Body.Heart bh = new Body().new Heart();
		bh.speak();

		Body b = new Body();
		b.show();
	}
}

class Body {
	private int height = 149;

	class Heart {
		int beats = 80;

		public void speak() {
			System.out.println("小心脏扑通扑通的挑、" + height + "..." + beats);
		}
	}

	public void show() {
		Heart h = new Heart();
		h.speak();
	}

}
