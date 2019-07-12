class Demo02_重写的注意事项 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.test();
		z.test2();
	}
}

class Fu {
	private void test() {
		System.out.println("父类的私有方法");
	}

	public void test2() {
		System.out.println("父类的test2");
	}
}

class Zi extends Fu {
	//@Override
	public void test() {
		System.out.println("子类的公有方法");
	}

	//如果想尝试在重写的时候，分配更小的权限，就会编译报错
	/*void test2() {
		System.out.println("子类的test2");
	}*/

	public void test2() {
		System.out.println("子类的test2");
		super.test2();
	}
}