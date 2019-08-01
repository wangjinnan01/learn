package cn.offcn.demo;

public class DemoThreadPrint {
	
	public static void main(String[] args) {
		
		Printor p=new Printor();
		Thread t1=new Thread() {
			
			public void run() {
				while(true) {
					p.print1();
				}
			}
		};
		
        Thread t2=new Thread() {
			
			public void run() {
				while(true) {
					p.print2();
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}

}

class Printor{
	
    //Object obj=new Object();
	//Printor.class
	public static synchronized void print1() {
		/*
		//这个锁对象必须是同一个对象
		synchronized (this) {
			System.out.print("中");
			System.out.print("公");
			System.out.print("教");
			System.out.println("育");
		}*/
		
		System.out.print("中");
		System.out.print("公");
		System.out.print("教");
		System.out.println("育");
	}
	
	public void print2() {
		
		synchronized (Printor.class) {
			System.out.print("优");
			System.out.print("就");
			System.out.println("业");
		}
	}
}
