package cn.offcn.demo;

public class DemoThreadThree {
	
	public static void main(String[] args) {
		//�����̶߳���
		MyThread01 mt01=new MyThread01();
		//�����̣߳�ֻ���������̣߳����̲߳�����cpu�Ķ������Ŷ�
		mt01.start();
		String threadName=mt01.getName();
		
		//��main���е��̴߳�ӡ��mt01�̵߳�����
		System.out.println(threadName);
		
		new Thread() {
			
			public void run() {
				System.out.println("bbb");
				//�̶߳����������getName��������ȡ���Լ��߳�����
				System.out.println(getName());
			}
		}.start();
		
		
	}

}

class MyThread01 extends Thread{
	
	public void run() {
		System.out.println("aaa");
	}
}
