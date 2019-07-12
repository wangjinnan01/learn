class Demo08_超人案例 {
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
		System.out.println("谈普通的生意");
	}
}

class SuperMan extends Man {
	String name = "Spider";

	public void dealBusiness() {
		System.out.println("谈谈几个亿的大单子");
	}

	public void fly() {
		System.out.println("到处飞着救人、拯救世界");
	}
}
