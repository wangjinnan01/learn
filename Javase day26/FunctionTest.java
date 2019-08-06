package cn.offcn.demo;

import java.util.function.Function;

public class FunctionTest {
	
	public static void main(String[] args) {
		//Function<String,Integer> f=x -> Integer.parseInt(x);
		//Integer result=test("123",f);
		//Integer result=test("123",x -> Integer.parseInt(x));
		//System.out.println(result+1);
		
		/*
		Integer result=test("123",x -> {
			int re=Integer.parseInt(x);
			return re*10;
		});
		System.out.println(result);
		*/
		
		//����������ȥʵ��
		int result=test3("205",x->Integer.parseInt(x),x-> x*10);
		System.out.println(result+10);
		
	}
	
	
	/**
	 * ��һ���ַ���ת������
	 * @param str
	 * @param f
	 * @return
	 */
	
	public static int  test(String str,Function<String,Integer> f) {
		
		return f.apply(str);
	}
	
	/**
	 * ��һ���ַ���ת������,������10
	 * @param str
	 * @param f
	 * @return
	 */
    public static int  test2(String str,Function<String,Integer> f) {
		
		return f.apply(str);
	}
    
    /**
     * ������������10,�����ؽ��
     * @param num
     * @param f
     * @return
     */
    
    public static int  test3(Integer num,Function<Integer,Integer> f) {
		
		return f.apply(num);
	}
    
    public static int test3(String str,Function<String,Integer> 
    f1,Function<Integer,Integer> f2) {
    	
    	return f1.andThen(f2).apply(str);
    	 
    }

}
