class Demo03_final�ؼ��� {

	public static final double PI = 3.14;
	//ÿ�����ж�����
	public static final int SECONDS_PER_MINUTE = 60; 

	public static void main(String[] args) {
		final int a = 10;
		System.out.println(a + 1);
		//System.out.println(a++);
		//a = 10;
		System.out.println(PI);
	}

	public static void test() {
		System.out.println(PI);
	}
}

final class Fu {
	public void test1() {
		System.out.println(666);
	}

	public void test2() {
		System.out.println(888);
		System.out.println(Demo03_final�ؼ���.PI);
	}
}

//class Zi extends Fu {}//Fu��һ�������࣬����������

class Fu2 {
	public void test1() {
		System.out.println(666);
	}

	public final void test2() {
		System.out.println(888);
	}
}

class Zi2 extends Fu2 {
	public void test1() {
		System.out.println(333);
	}

	/*public void test2() {
		System.out.println(999);
	}*/
}