package cn.offcn.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JuiceMachineTest {
	
	public static void main(String[] args) throws Exception {
		
		//����һ��ե֭������
		JuiceMachine jm=new JuiceMachine();
		//���ļ��ж�ȡˮ��
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		String className=br.readLine();
		Class clazz=Class.forName(className);
		Object obj=clazz.newInstance();
		Fruit f=(Fruit)obj;
		jm.juice(f);
		
		//Apple a=new Apple();
		//jm.juice(a);
	}

}


interface Fruit{
	public void flow();
}
class JuiceMachine{
	
	public void juice(Fruit f) {
		f.flow();
	}
}

class Apple implements Fruit{
	
	public void flow() {
		System.out.println("����ƻ��֭");
	}
}

class banana implements Fruit{
	
	public void flow() {
		System.out.println("�����㽶֭");
	}
}


class Orange implements Fruit{
	
	public void flow() {
		System.out.println("������֭");
	}
}
