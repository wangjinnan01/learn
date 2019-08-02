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
		
		  //创建一个DatagramSocket对象
		 DatagramSocket socket=new DatagramSocket();
		 byte[] buf="您好吗".getBytes();
		 //创建一个DatagramPacket对象
		 //封装了发送的内容，地址，端口
		 DatagramPacket dp=new DatagramPacket(buf,0,buf.length,InetAddress.getLocalHost(),8888);
		 //发送数据
		 socket.send(dp);
		 
	}

}
