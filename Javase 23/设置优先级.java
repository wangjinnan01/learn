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
		//�����̵߳����ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		//�����߳�����
		t1.setName("�����ȼ����߳�");
		
        Thread t2=new Thread() {
			
			public void run() {
				
				for(int i=1;i<=200;i++) {
					System.out.println(getName()+"======="+i);
				}
			}
		};
		//�����̵߳����ȼ�
		t2.setPriority(Thread.MIN_PRIORITY);
		//�����߳�����
		t2.setName("�����ȼ����߳�");
		
		t2.start();
		
		t1.start();
		
		
		
		
	}

}
