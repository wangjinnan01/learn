package cn.offcn.demo;

public class DemoThreadOne {
	
	public static void main(String[] args) {
		
		//�½���һ���̶߳������
		//Thread01 t1=new Thread01();
		//t1.start();  //��ʱ���̲߳��п��ܱ�cpuִ��
		
		//����һ���������
		MyTask mt=new MyTask();
		//���������󶨵�һ���߳���
		Thread t2=new Thread(mt);
		//�����߳�
		t2.start();
		
		  
	}

}

class Thread01 extends Thread{
	
	public void run() {
		//д���߳�Ҫִ�еĴ���
		for(int i=1;i<=200;i++)
		System.out.println("������"+i);
	}
	
}

class MyTask implements Runnable{

	@Override
	public void run() {
		
		//������Ҫִ�е�����
		System.out.println("ִ����Runnable�е�run����");
	}
	
}
