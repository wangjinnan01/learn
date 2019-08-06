package cn.offcn.demo;

public class LambdeDemo {
	
	public static void main(String[] args) {
		//lambde();
		lambde01();
	}

	
     public static void lambde01(){
		
		MyLambde ml=() -> System.out.println("Lambde test����");
		ml.test();
	}
	public static void lambde(){
		
		MyLambde ml=new MyLambde() {

			public void test() {
				System.out.println("test����");
			}
			
		};
		ml.test();
	}
}

interface MyLambde{
	public void test();
}


