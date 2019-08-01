package cn.offcn.practice;

public class DemoThreadStatus {

	public static void main(String[] args) throws InterruptedException {
		
		//ThreadStatus();
		//Thread_TIMED_WAITING();
		Thread_BLOCKED();
		
	}
	
	public static void Thread_BLOCKED() throws InterruptedException {
		
		Thread t1=new Thread() {
			
			public void run() {
				synchronized ("aaaa") {
					for(int i=0;i<100;i++) {
						System.out.println("===="+i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
		};
		
        Thread t2=new Thread() {
			
			public void run() {
				synchronized ("aaaa") {
					for(int i=0;i<100;i++) {
						System.out.println("#####"+i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
		};
		t1.start();
		t2.start();
		
		while(true) {
			System.out.println(t1.getState()+".....t1");
			System.out.println(t2.getState()+".....t2");
			Thread.sleep(50);
			
		}
		
	}
	
	public static void Thread_TIMED_WAITING() throws InterruptedException {
		
		Thread t1=new Thread() {
			public void run() {
				
				for(int i=0;i<100;i++) {
					System.out.println("===="+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		t1.start();
		while(true) {
			System.out.println(t1.getState());
			Thread.sleep(50);
		}
		
		
		
	}
	
	public static void ThreadStatus() {
		Thread tt=new Thread() {
			public void run() {
				System.out.println("aaaa");
			}
		};
		
		tt.start();
		System.out.println(tt.getState());
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tt.getState());
	}
}
