package cn.offcn.demo;

public class DemoThreadLock {
	
	public static void main(String[] args) {
		
		 Thread t1=new Thread("A哲学家") {
			 
			 public void run() {
				 while(true) {
					 
					    synchronized ("A筷子") {
					    	System.out.println(getName()+"  拥用A筷子，等待B筷子");
					    	synchronized ("B筷子") {
					    		System.out.println(getName()+"  可以疯狂的吃饭");
							}
							
						}
				 }
				 
			 }
		 };
		 
         Thread t2=new Thread("B哲学家") {
			 
			 public void run() {
				 while(true) {
					 
					    synchronized ("B筷子") {
					    	System.out.println(getName()+"  拥用B筷子，等待A筷子");
					    	synchronized ("A筷子") {
					    		System.out.println(getName()+"  可以疯狂的吃饭");
							}
							
						}
				 }
				 
			 }
		 };
		 
		 t1.start();
		 t2.start();
	}

}
