class Demo02_��д��ע������ {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.test();
		z.test2();
	}
}

class Fu {
	private void test() {
		System.out.println("�����˽�з���");
	}

	public void test2() {
		System.out.println("�����test2");
	}
}

class Zi extends Fu {
	//@Override
	public void test() {
		System.out.println("����Ĺ��з���");
	}

	//����볢������д��ʱ�򣬷����С��Ȩ�ޣ��ͻ���뱨��
	/*void test2() {
		System.out.println("�����test2");
	}*/

	public void test2() {
		System.out.println("�����test2");
		super.test2();
	}
}