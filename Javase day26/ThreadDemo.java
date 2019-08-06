package cn.offcn.demo;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Runnable r=()->{
			for(int i=0;i<200;i++)
			System.out.println("Runnbale"+i);
		};
		
		new Thread(r).start();
		
	}

}
