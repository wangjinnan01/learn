package cn.offcn.demo;

public class LambdeDemo01 {

	public static void main(String[] args) {
		
		//MyLambde01 mi01=(x) -> System.out.println(x*x);
		//MyLambde01 mi01= x -> System.out.println(x*x);
		//mi01.test01(5);
		MyLambde01 mi01= x -> {x=x+1;System.out.println(x*x);};
		mi01.test01(5);
	}
	
}

interface MyLambde01{
	public void test01(int x);
}
