package com.ujiuye.demos;

public class Demo11_�Զ�װ��Ͳ��� {
	public static void main(String[] args) {
		test2_�Զ�װ��Ͳ���();
		
	}

	private static void test2_�Զ�װ��Ͳ���() {
		//�Զ�װ��
		Integer it = 100;
		
		//�Զ�����
		int i = it;
		System.out.println(i);
		
		
		Integer itg = 10;//�Զ�װ��
		itg = itg + 1;//���Զ����䣬��ȡ��intֵ�����㣬������Զ�װ��
		
		Integer inte = null;
		//int k = inte;����ʹ��null�����Զ�����
	}

	private static void test1_װ��Ͳ���() {
		int i = 10;
		//װ��
		Integer it = new Integer(i);
		//����
		int j = it.intValue();
	}
}
