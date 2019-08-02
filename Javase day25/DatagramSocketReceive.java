package cn.offcn.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocketReceive {
	
	public static void main(String[] args) throws Exception {
		receive();
	}
	
	public static void receive() throws Exception {
		
		//创建一个DatagramSocket，并指定端口
		DatagramSocket ds=new DatagramSocket(8888);
		//定义一个byte数组用于接收内容
		byte[] buf=new byte[1024];
		//准备一个接收容器
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		//从DatagramPacket对象中可以得到真正的数据大小
		byte[] data=dp.getData();
		int len=dp.getLength();
		String content=new String(data,0,len);
		System.out.println(content);
		
		
	}

}
