package cn.offcn.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramSocketSend {
	
	public static void main(String[] args) throws Exception {
		sendData();
	}
	
	public static void sendData() throws Exception {
		
		  //����һ��DatagramSocket����
		 DatagramSocket socket=new DatagramSocket();
		 byte[] buf="������".getBytes();
		 //����һ��DatagramPacket����
		 //��װ�˷��͵����ݣ���ַ���˿�
		 DatagramPacket dp=new DatagramPacket(buf,0,buf.length,InetAddress.getLocalHost(),8888);
		 //��������
		 socket.send(dp);
		 
	}

}
