package cn.offcn.demo;

public class DemoThreadSeven {
	
	public static void main(String[] args) {
		
		 Thread td=new Thread() {
			 public void run() {
				  while(true) {
					  System.out.println("我一直为大家提供服务...");
				  }
			 }
		 };
		 //设置td为守护线程
		 td.setDaemon(true);
		 //启动线程
		 td.start();
		 
		 for(int i=1;i<1000;i++) {
			 System.out.println(Thread.currentThread().getName()+"======"+i);
		 }
		 
	}

}
