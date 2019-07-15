class Demo02_接口中成员的特点 {
	public static void main(String[] args) {
		System.out.println(MyInter2.a);
		//MyInter2.a = 20;
	}
}

interface MyInter2 {
	public final static int a = 10;

	public abstract void test();
}
