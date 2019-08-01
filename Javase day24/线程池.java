package cn.offcn.practice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ExecutorsTest {
	
	public static void main(String[] args) {
		//createSingleThreadPool();
		createFixedThreadPool();
		
		
		
	}
	
	
	
	public  Task04 getTask04() {
		return new Task04();
	}
	
	public static void createFixedThreadPool() {
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		Runnable r1=new Runnable() {
			
			public void run() {
				for(int i=0;i<100;i++) {
				   System.out.println(Thread.currentThread().getName()
						   +"aaaaa===="+i);
				}
			}
		};
		
		Runnable r2=new Runnable() {
			
			public void run() {
				for(int i=0;i<100;i++) {
				   System.out.println(Thread.currentThread().getName()
						   +"bbbbb===="+i);
				}
			}
		};
		
		Runnable r3=new Runnable() {
			
			String name="ccccc";
			public void run() {
				for(int i=0;i<100;i++) {
				   System.out.println(Thread.currentThread().getName()
						   +name+i);
				}
			}
		};
		
		
		
		//提交任务
		es.submit(r1);
		es.submit(r2);
		es.submit(r3);
		
		es.submit(new Task04());
		
		//es.shutdown();
		List<Runnable> unList = es.shutdownNow();
		for(Runnable r : unList) {
			System.out.println(r);
			
		}
		
		
	}
	
	public static void createSingleThreadPool() {
		//创建一个只有一个线程对象的线程池
				ExecutorService es = Executors.newSingleThreadExecutor();
				
				
				Runnable r1=new Runnable() {
					
					public void run() {
						for(int i=0;i<100;i++) {
						   System.out.println(Thread.currentThread().getName()
								   +"aaaaa===="+i);
						}
					}
				};
				
		        Runnable r2=new Runnable() {
					
					public void run() {
						for(int i=100;i<200;i++) {
						   System.out.println(Thread.currentThread().getName()
								   +"aaaaa===="+i);
						}
					}
				};
				
				//把任务提交ExecutorService来处理
				//es.execute(r1);
				//es.execute(r2);
				es.submit(r1);
	}

}


class Task04 implements Runnable{
	String name="ddddd";
	public String getName() {
		return name;
	}
	public void run() {
		for(int i=0;i<100;i++) {
		   System.out.println(Thread.currentThread().getName()
				   +name+i);
		}
	}
}
