class Demo01_�ӿڵ��ص� {
	public static void main(String[] args) {
		MyImpl1 mi1 = new MyImpl1();
		mi1.test1();

		MyInter1 mi2 = new MyImpl1();
		mi2.test1();

		//MyInter1 mi3 = new MyInter1();�ӿڲ���ֱ�Ӵ�������
	}
}

interface MyInter1 {
	public abstract void test1();
}

class MyImpl1 implements MyInter1 {
	@Override
	public void test1() {
		System.out.println("test1");
	}
}
