import java.io.BufferedReader;
import java.io.FileReader;
class Demo10_ե֭������ {
	public static void main(String[] args) throws Exception {
		JuiceMachine jm = new JuiceMachine();
		//����������δ��룬����Ҫ���գ�����̬�ĺô�
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
		System.out.println("ե֭��ͨ��");
		a.flow();
		System.out.println("����ե֭��");
	}

	public void makeJuice(Orange o) {
		System.out.println("ե֭��ͨ��");
		o.flow();
		System.out.println("����ե֭��");
	}*/

	public void makeJuice(Fruit f) {//Fruit f = new Apple();
		System.out.println("ե֭��ͨ��");
		f.flow();
		System.out.println("����ե֭��");
	}
}

class Fruit {
	public void flow() {}
}

class Orange extends Fruit {
	@Override
	public void flow() {
		System.out.println("��������֭");
	}
}

class Apple extends Fruit {
	@Override
	public void flow() {
		System.out.println("����ƻ��֭");
	}
}

class Watermelon extends Fruit {
	@Override
	public void flow() {
		System.out.println("��������֭");
	}
}
