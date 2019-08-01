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
		//��������������ͬһ������
		synchronized (this) {
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
		}*/
		
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println("��");
	}
	
	public void print2() {
		
		synchronized (Printor.class) {
			System.out.print("��");
			System.out.print("��");
			System.out.println("ҵ");
		}
	}
}
