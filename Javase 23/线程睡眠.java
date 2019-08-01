package cn.offcn.demo;

public class DemoThreadSix {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread td=new Thread() {
			
			public void run() {
				for(int i=1;i<1000;i++) {
					System.out.println("aaa===="+i);
					
				}
				
			}
		};
		td.start();
		
		for(int i=1;i<10;i++) {
			System.out.println("bbbbb======"+i);
			Thread.sleep(50);
		}
		
		
	}

}

class MyThread05 extends Thread{
	
	public void run() {
		
		System.out.println("ccc");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

