package cn.offcn.practice;

public class SubInner  extends Outer.Inner{
	
	public SubInner(Outer out) {
		//super();//调用父类中的无参构造方法
		out.super();
	}
	
	public static void main(String[] args) throws Exception {
		
		Outer outer=new Outer();
		SubInner si=new SubInner(outer);
		si.print();
		si.output();
		
	}

}
public class Outer{

    class Inner{
     
           int index=100;
           public void print(){
              
              System.out.println("Inner's print method"+index);

           }
           public void output() throws Exception{
                 
                  FileOutputStream fis=new FileOutputStream("aaa.txt");
                  fis.write("I'am call output method".getBytes());
                  fis.close();

           }

    }
}