package cn.offcn.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JuiceMachineTest {
	
	public static void main(String[] args) throws Exception {
		
		//构造一个榨汁机对象
		JuiceMachine jm=new JuiceMachine();
		//从文件中读取水果
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
		System.out.println("流出苹果汁");
	}
}

class banana implements Fruit{
	
	public void flow() {
		System.out.println("流出香蕉汁");
	}
}


class Orange implements Fruit{
	
	public void flow() {
		System.out.println("流出橙汁");
	}
}
