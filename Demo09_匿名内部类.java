class Demo09_匿名内部类 {
	public static void main(String[] args) {
		Inter i = new Impl();
		i.test();

		new Inter() {
			@Override
			public void test() {
				System.out.println("匿名内部类的test实现");
			}
		}.test();
	}
}

interface Inter {
	public abstract void test();
}

class Impl implements Inter {
	@Override
	public void test() {
		System.out.println("test方法被实现了");
	}
}
