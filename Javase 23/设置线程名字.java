package cn.offcn.demo;

public class DemoThreadFour {
	
	public static void main(String[] args) {
		
		Thread td=new Thread() {
			
			public void run() {
				System.out.println("-----aaa");
				System.out.println(getName());
			}
		};
		
		td.setName("�߳�10");
		//�����߳�
		td.start();
		//main�߳�����td�̵߳�����
		//td.setName("�߳�100");
		
		
		MyTask10 mt10=new MyTask10();
		//����һ���̶߳���
		Thread td02=new Thread(mt10);
		td02.start();
		
		
		
	}
	

}

class MyTask10 implements Runnable{

	
	public void run() {
		//��ȡ��ǰ���̶߳���
		Thread td=Thread.currentThread();
		System.out.println(td.getName()+"=====run");
	}
	
}
