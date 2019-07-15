class Demo03_接口和类的关系 {
	public static void main(String[] args) {
		MyInter3 mi3 = new MyImpl3();
		mi3.test1();
		//mi3.test3();
	}
}

interface MyInter3 {
	public abstract void test1();

	public abstract void test2();
}

interface MyInter4 {
	public abstract void test1();

	public abstract void test3();
}

class MyImpl3 implements MyInter3, MyInter4 {
	public void test1(){
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}

	public void test3() {
		System.out.println("test3");
	}
}
