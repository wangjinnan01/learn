package cn.offcn.demo;

public class DemoThreadTen {
	
	public static void main(String[] args) {
		
		MyTask100 mt100=new MyTask100();
		Thread t1=new Thread(mt100,"线程A");
		Thread t2=new Thread(mt100,"线程B");
		t1.start();
		t2.start();
		
	}

}

class MyTask100  implements Runnable{

    int money=0;
	public void run() {
	    for(int i=1;i<=10000;i++) {
	    	//线程A
	    	money=money+1;
	    }
	    System.out.println(Thread.currentThread().getName()+"==="+money);
	}
	
}
