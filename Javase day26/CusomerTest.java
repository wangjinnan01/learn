package cn.offcn.demo;

import java.util.function.Consumer;

public class CusomerTest {
	
	public static void main(String[] args) {
		
		/**�����ͽӿ�*/
		Customer01 c1=x -> System.out.println(x*10);
		c1.aaaa(2);
		
		Consumer<Integer> c2= a -> System.out.println(a-5);
		c2.accept(10);
		
		Consumer<String> c3= a -> {
			int x=Integer.parseInt(a);
			x=x*5;
			System.out.println(x);
		};
		c3.accept("4");
		
		
		
		
		
		
	}

}

interface Customer01{
	
	/**
	 * ���ܾ��ǽ�xֵ����10�����д�ӡ
	 * @param x
	 */
	public void  aaaa(int x);
}
