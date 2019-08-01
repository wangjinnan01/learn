package cn.offcn.demo;

public class DemoThreadNine {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread() {
			
			public void run() {
				
				for(int i=1;i<=200;i++) {
					System.out.println(getName()+"......."+i);
				}
			}
		};
		//设置线程的优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		//设置线程名子
		t1.setName("高优先级的线程");
		
        Thread t2=new Thread() {
			
			public void run() {
				
				for(int i=1;i<=200;i++) {
					System.out.println(getName()+"======="+i);
				}
			}
		};
		//设置线程的优先级
		t2.setPriority(Thread.MIN_PRIORITY);
		//设置线程名子
		t2.setName("低优先级的线程");
		
		t2.start();
		
		t1.start();
		
		
		
		
	}

}
