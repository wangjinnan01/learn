class Demo11_继承中构造方法的关系 {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
}

class Fu {
	public Fu() {
		System.out.println("父类的空参构造");
	}

	public Fu(int a) {
		System.out.println("父类的有参构造 ：" + a);
	}
}

class Zi extends Fu {
	public Zi() {
		super();
		//this(888);
		System.out.println("子类空参构造");
	}

	public Zi(int b) {
		//this();
		System.out.println("子类的有参构造 ：" + b);
	}
}
