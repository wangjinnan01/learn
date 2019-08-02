package cn.offcn.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {
	
	public static void main(String[] args)  throws Exception{
		
		client();
	}
	
	public static void client() throws Exception {
		//����һ���ͻ��˵��׽��ֶ���
		Socket s=new Socket(InetAddress.getLocalHost(),6666);
		
		//����̲߳��ϵķ�����Ϣ
		new Thread() {
			public void run() {
				try {
					Scanner sc=new Scanner(System.in);
					OutputStream os=s.getOutputStream();
					while(true) {
						String sendMessage=sc.nextLine();
						//��ȡ���������
						/*
						OutputStreamWriter osw=new OutputStreamWriter(os);
						BufferedWriter bw=new BufferedWriter(osw);
						bw.write(sendMessage);
						bw.flush();
						*/
						PrintWriter pw=new PrintWriter(os,true);
						pw.println(sendMessage);
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}.start();
		
		//���ϵĽ�����Ϣ
		new Thread() {
			public void run() {
				while(true) {
					try {
						  InputStream is=s.getInputStream();
						  InputStreamReader isw=new InputStreamReader(is);
						  BufferedReader  br=new BufferedReader(isw);
					      String message=br.readLine();
					      System.out.println(message);
					}catch(Exception e) {
						e.printStackTrace();
					}
					  
				     
				}
				
				
			}
		}.start();
		
	}

}
