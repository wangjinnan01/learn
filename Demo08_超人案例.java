class Demo08_���˰��� {
	public static void main(String[] args) {
		Man m = new SuperMan();
		System.out.println(m.name);
		m.dealBusiness();

		SuperMan sm = (SuperMan)m;
		sm.fly();
	}
}

class Man {
	String name = "Mike";

	public void dealBusiness() {
		System.out.println("̸��ͨ������");
	}
}

class SuperMan extends Man {
	String name = "Spider";

	public void dealBusiness() {
		System.out.println("̸̸�����ڵĴ���");
	}

	public void fly() {
		System.out.println("�������ž��ˡ���������");
	}
}
