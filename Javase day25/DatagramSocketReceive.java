package cn.offcn.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramSocketReceive {
	
	public static void main(String[] args) throws Exception {
		receive();
	}
	
	public static void receive() throws Exception {
		
		//����һ��DatagramSocket����ָ���˿�
		DatagramSocket ds=new DatagramSocket(8888);
		//����һ��byte�������ڽ�������
		byte[] buf=new byte[1024];
		//׼��һ����������
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		//��DatagramPacket�����п��Եõ����������ݴ�С
		byte[] data=dp.getData();
		int len=dp.getLength();
		String content=new String(data,0,len);
		System.out.println(content);
		
		
	}

}
