class Demo11_�̳��й��췽���Ĺ�ϵ {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
}

class Fu {
	public Fu() {
		System.out.println("����Ŀղι���");
	}

	public Fu(int a) {
		System.out.println("������вι��� ��" + a);
	}
}

class Zi extends Fu {
	public Zi() {
		super();
		//this(888);
		System.out.println("����ղι���");
	}

	public Zi(int b) {
		//this();
		System.out.println("������вι��� ��" + b);
	}
}
