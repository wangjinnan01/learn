package cn.offcn.demo;

public class DeThreadTwo {
	
	public static void main(String[] args) {
		
		new Thread() {
			
			public void run() {
				System.out.println("aaaa");
			}
		}.start();
		
		new Thread(new Runnable() {

			
			public void run() {
				System.out.println("bbbb");
			}
			
		}).start();
		
		
		Thread t2=new Thread() {
			public void run() {
				System.out.println("aaaa");
			}
		};
		t2.start();
		
		
	}

}
