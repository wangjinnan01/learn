package cn.offcn.demo;

public class DemoThreadEnghit {

	public static void main(String[] args) {
		new Gar();
		System.gc();//�ֶ���������������
	}
}

class Gar{
	
	@Override
	protected void finalize() throws Throwable {
		//��ȡ��ǰִ�е��̶߳���
		Thread currentThread=Thread.currentThread();
		System.out.println(currentThread.isDaemon());
		
	}
}
