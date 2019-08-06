package cn.offcn.demo;

public class LambdeDemo03 {

	public static void main(String[] args) {
		
		
		/*MyLambde02 mi01= (x,y) -> {
			 int result=x+y;
			 System.out.println(result);
	    };
		mi01.test02(5,6);*/
		
		MyLambde02 mi01= (x,y) -> System.out.println(x+y);
	    
		mi01.test02(5,6);
	}
	
}

interface MyLambde02{
	public void test02(int x,int y);
}
