package cn.offcn.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CloseStreamTest {
	
	public static void main(String[] args) {
		
	}
	
	public static void aaa() throws Exception{
		FileReader fr=null;
		FileWriter fw=null;
		try {
			 fr=new FileReader("ddd.txt");
			 int c=0;
			 while((c=fr.read())!=-1) {
				 //。。。。
			 }
			 
			 fw=new FileWriter("eee.txt");
			 fw.write('a');
			 
		}catch(Exception e) {
			
		}finally {
			
			try {
				if(fr!=null) {
					fr.close();
				}
			}finally {
				if(fw!=null) {
					fw.close();
				}
			}
			
			
			
		}
		 
	}
	
	public static void bbb() throws Exception {
		try(
				 FileReader fr=new FileReader("ddd.txt");
				 FileWriter fw=new FileWriter("eee.txt");
				 
			){
			
			 fr.read();
			 fw.write('c');
			
		}
		 
	}

}
