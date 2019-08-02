package cn.offcn.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest {
	
	public static void main(String[] args) throws Exception {
		server();
	}
	
	public static void server() throws Exception {
		
		//创建一个服务对象,并指定在6666端口接收信息
		ServerSocket ss=new ServerSocket(6666);
		//等待客户端消息的到来,得到客户端Socket的对象
	
		Socket s= ss.accept();
		//从客户端得到输入流
		new Thread() {
			public void run() {
				
				while(true) {
					try {
						InputStream is=s.getInputStream();
						InputStreamReader isr=new InputStreamReader(is);
						BufferedReader br=new BufferedReader(isr);
						String message=br.readLine();
						System.out.println(message);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				
				
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				try {
					Scanner sc=new Scanner(System.in);
					OutputStream os=s.getOutputStream();
					while(true) {
						String sendMessage=sc.nextLine();
						PrintWriter pw=new PrintWriter(os,true);
						pw.println(sendMessage);
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}.start();
	
	}

}
