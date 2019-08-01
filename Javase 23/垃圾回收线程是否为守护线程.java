package cn.offcn.demo;

public class DemoThreadEnghit {

	public static void main(String[] args) {
		new Gar();
		System.gc();//手动调用垃圾回收器
	}
}

class Gar{
	
	@Override
	protected void finalize() throws Throwable {
		//获取当前执行的线程对象
		Thread currentThread=Thread.currentThread();
		System.out.println(currentThread.isDaemon());
		
	}
}
