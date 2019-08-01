package cn.offcn.practice;

public class SingleTest {
    public static void main(String[] args) {
		
    	//new SingleDemo();
    	//SingleDemo sd1=SingleDemo.getSingleDemo();
    	//SingleDemo sd2=SingleDemo.getSingleDemo();
    	//System.out.println(sd1==sd2);
    	//SingleDemoLazy sdy1=SingleDemoLazy.getSingleDemoLazy();
    	//SingleDemoLazy sdy2=SingleDemoLazy.getSingleDemoLazy();
    	//System.out.println(sdy1==sdy2);
    	SingleDemoOld sdo1=SingleDemoOld.sd;
    	SingleDemoOld sdo2=SingleDemoOld.sd;
    	System.out.println(sdo1==sdo2);
    	//SingleDemoOld.sd=null;
    	
    	
    	
	}
}

class SingleDemo{
	
	private static SingleDemo sd=new SingleDemo();
	private SingleDemo() {
		
	}
	
	public static SingleDemo getSingleDemo() {
		return sd;
	}
	
}

class SingleDemoLazy{
	
	private static SingleDemoLazy sd;
	private SingleDemoLazy() {
		
	}
	
	public static SingleDemoLazy getSingleDemoLazy() {
		//是给以后访问这个方法时提供效率，就不会进入同步块
		if(sd==null) {
			synchronized (SingleDemoLazy.class) {
				//在前几次多线程下，防止多例。
				if(sd==null)
				{
					sd=new SingleDemoLazy();
				}
			}
		}
		
		
		return sd;
	}
	
}


class SingleDemoOld{
	
    static final SingleDemoOld sd=new SingleDemoOld();
	private SingleDemoOld() {
		
	}
	
	
	
}


