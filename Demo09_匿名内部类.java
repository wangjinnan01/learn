class Demo09_�����ڲ��� {
	public static void main(String[] args) {
		Inter i = new Impl();
		i.test();

		new Inter() {
			@Override
			public void test() {
				System.out.println("�����ڲ����testʵ��");
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
		System.out.println("test������ʵ����");
	}
}
