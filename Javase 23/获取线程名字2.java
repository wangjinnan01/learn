package cn.offcn.demo;

public class DemoThreadFive {
	
	public static void main(String[] args) {
		//��ȡִ��main�����̵߳�����
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
