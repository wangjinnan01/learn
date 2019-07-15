class Demo08_局部内部类 {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		int a = 10;

		class MyInner {
			int b = 20;
			
			public void show() {
				System.out.println(a + "..." + b);
			}
		}

		MyInner mi = new MyInner();
		mi.show();
	}
}
