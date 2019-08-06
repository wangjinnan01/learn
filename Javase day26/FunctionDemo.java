package cn.offcn.demo;

public class FunctionDemo {

	
	public void f1(A a) {
		a.print();
	}
}

@FunctionalInterface
interface A{
	public void print();
}

//@FunctionalInterface
interface B{
	public void print1();
	public void print2();
}

/**
     function add(a,b){
        return a+b;
     }
     
     function aaa(a){
     }
     
     aaa(add(3,4));
**/
