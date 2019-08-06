package cn.offcn.demo;

public class LambdeDemo04 {

	public static void main(String[] args) {
		
		//MyLambde03 mi01=(x,y)->{return x+y;};
		MyLambde03 mi01=(x,y)-> x+y;
		int result=mi01.test03(10, 20);
		System.out.println(result);
	}
	
}

interface MyLambde03{
	
	public int test03(int x,int y);
}
