class Demo10_this��super�ؼ��� {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.test(30);
	}
}

class Fu {
	int i = 10;
}

class Zi extends Fu {
	int i = 20;

	public void test(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
