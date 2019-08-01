package cn.offcn.demo;

public class DemoThreadOne {
	
	public static void main(String[] args) {
		
		//新建了一个线程对象而已
		//Thread01 t1=new Thread01();
		//t1.start();  //这时该线程才有可能被cpu执行
		
		//创建一个任务对象
		MyTask mt=new MyTask();
		//把任务对象绑定到一个线程上
		Thread t2=new Thread(mt);
		//启动线程
		t2.start();
		
		  
	}

}

class Thread01 extends Thread{
	
	public void run() {
		//写该线程要执行的代码
		for(int i=1;i<=200;i++)
		System.out.println("运行了"+i);
	}
	
}

class MyTask implements Runnable{

	@Override
	public void run() {
		
		//任务所要执行的内容
		System.out.println("执行了Runnable中的run方法");
	}
	
}
