package cn.offcn.properties;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {
	
	public static void main(String[] args)throws IOException {
		
		
	}
	
	public static void output() throws IOException {
		 //IO包的异常  编译时异常
		 try {
			FileWriter fw=new FileWriter("ccc.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void output2()  {
		 //IO包的异常  编译时异常
		 try {
			 int a=1/0;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
