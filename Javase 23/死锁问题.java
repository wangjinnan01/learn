package cn.offcn.demo;

public class DemoThreadLock {
	
	public static void main(String[] args) {
		
		 Thread t1=new Thread("A��ѧ��") {
			 
			 public void run() {
				 while(true) {
					 
					    synchronized ("A����") {
					    	System.out.println(getName()+"  ӵ��A���ӣ��ȴ�B����");
					    	synchronized ("B����") {
					    		System.out.println(getName()+"  ���Է��ĳԷ�");
							}
							
						}
				 }
				 
			 }
		 };
		 
         Thread t2=new Thread("B��ѧ��") {
			 
			 public void run() {
				 while(true) {
					 
					    synchronized ("B����") {
					    	System.out.println(getName()+"  ӵ��B���ӣ��ȴ�A����");
					    	synchronized ("A����") {
					    		System.out.println(getName()+"  ���Է��ĳԷ�");
							}
							
						}
				 }
				 
			 }
		 };
		 
		 t1.start();
		 t2.start();
	}

}
