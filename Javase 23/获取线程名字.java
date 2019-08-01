package cn.offcn.demo;

public class DemoThreadThree {
	
	public static void main(String[] args) {
		//创建线程对象
		MyThread01 mt01=new MyThread01();
		//启动线程，只有启动了线程，该线程才能在cpu的队列中排队
		mt01.start();
		String threadName=mt01.getName();
		
		//由main所有的线程打印的mt01线程的名子
		System.out.println(threadName);
		
		new Thread() {
			
			public void run() {
				System.out.println("bbb");
				//线程对象本身调用了getName方法，获取了自己线程名子
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
