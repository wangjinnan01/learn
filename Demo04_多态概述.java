class Demo04_¶àÌ¬¸ÅÊö {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.shout();
	}
}

class Animal {
	public void shout() {
		System.out.println("·¢ÉùÒô½Ğ");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("ß÷ß÷½Ğ");
	}
}
