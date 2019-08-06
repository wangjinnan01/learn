package cn.offcn.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		
	    Random r=new Random();
		Supplier<Integer> supp= ()->r.nextInt(51)+30;
		List<Integer> list=test(5,supp);
		System.out.println(list);
	}
	
	/**
	 * ��List<Integer>�����д��n��30-80֮�������
	 * @param supp
	 * @return
	 */
	public static List<Integer>  test(int n,Supplier<Integer> supp) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(supp.get());
		}
		return list;
	}

}
