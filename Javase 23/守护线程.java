package cn.offcn.demo;

public class DemoThreadSeven {
	
	public static void main(String[] args) {
		
		 Thread td=new Thread() {
			 public void run() {
				  while(true) {
					  System.out.println("��һֱΪ����ṩ����...");
				  }
			 }
		 };
		 //����tdΪ�ػ��߳�
		 td.setDaemon(true);
		 //�����߳�
		 td.start();
		 
		 for(int i=1;i<1000;i++) {
			 System.out.println(Thread.currentThread().getName()+"======"+i);
		 }
		 
	}

}
