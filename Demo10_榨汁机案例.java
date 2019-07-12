import java.io.BufferedReader;
import java.io.FileReader;
class Demo10_榨汁机案例 {
	public static void main(String[] args) throws Exception {
		JuiceMachine jm = new JuiceMachine();
		//接下来的这段代码，不需要掌握，体会多态的好处
		BufferedReader br = new BufferedReader(new FileReader("fruit.txt"));
		String className = br.readLine();
		Class c = Class.forName(className);
		Object obj = c.newInstance();
		Fruit f = (Fruit)obj;

		jm.makeJuice(f);

		jm.makeJuice(new Apple());
	}
}

class JuiceMachine {
	/*public void makeJuice(Apple a) {
		System.out.println("榨汁机通电");
		a.flow();
		System.out.println("清理榨汁机");
	}

	public void makeJuice(Orange o) {
		System.out.println("榨汁机通电");
		o.flow();
		System.out.println("清理榨汁机");
	}*/

	public void makeJuice(Fruit f) {//Fruit f = new Apple();
		System.out.println("榨汁机通电");
		f.flow();
		System.out.println("清理榨汁机");
	}
}

class Fruit {
	public void flow() {}
}

class Orange extends Fruit {
	@Override
	public void flow() {
		System.out.println("流出橘子汁");
	}
}

class Apple extends Fruit {
	@Override
	public void flow() {
		System.out.println("流出苹果汁");
	}
}

class Watermelon extends Fruit {
	@Override
	public void flow() {
		System.out.println("流出西瓜汁");
	}
}
