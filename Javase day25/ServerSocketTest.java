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
		
		//����һ���������,��ָ����6666�˿ڽ�����Ϣ
		ServerSocket ss=new ServerSocket(6666);
		//�ȴ��ͻ�����Ϣ�ĵ���,�õ��ͻ���Socket�Ķ���
	
		Socket s= ss.accept();
		//�ӿͻ��˵õ�������
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
