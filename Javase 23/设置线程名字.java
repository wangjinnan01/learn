package cn.offcn.demo;

public class DemoThreadFour {
	
	public static void main(String[] args) {
		
		Thread td=new Thread() {
			
			public void run() {
				System.out.println("-----aaa");
				System.out.println(getName());
			}
		};
		
		td.setName("线程10");
		//启动线程
		td.start();
		//main线程设置td线程的名子
		//td.setName("线程100");
		
		
		MyTask10 mt10=new MyTask10();
		//创建一个线程对象
		Thread td02=new Thread(mt10);
		td02.start();
		
		
		
	}
	

}

class MyTask10 implements Runnable{

	
	public void run() {
		//获取当前的线程对象
		Thread td=Thread.currentThread();
		System.out.println(td.getName()+"=====run");
	}
	
}
