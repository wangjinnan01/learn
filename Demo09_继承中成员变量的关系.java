class Demo09_�̳��г�Ա�����Ĺ�ϵ {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.test();
		z.display(300);
	}
}

class Fu {
	int num = 10;

	int a = 100;
}

class Zi extends Fu {
	int sz = 20;

	int a = 200;

	public void test() {
		System.out.println(num);
		System.out.println(sz);
	}

	public void show() {
		System.out.println(a);
	}

	public void display(int a) {
		System.out.println(a);//��ӡ300
		System.out.println(this.a);//200
		System.out.println(super.a);//100
	}
}
