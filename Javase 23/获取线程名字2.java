package cn.offcn.demo;

public class DemoThreadFive {
	
	public static void main(String[] args) {
		//获取执行main方法线程的名子
		String mainName=Thread.currentThread().getName();
		System.out.println(mainName);
		
		for(int i=1;i<999999;i++) {
			new Demo();
		}
		
	}

}

class Demo{
	
	@Override
	protected void finalize() throws Throwable {
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName);
	}
	
}
