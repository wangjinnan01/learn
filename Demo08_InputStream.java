package com.ujiuye.demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Demo08_InputStream {
	public static void main(String[] args) throws IOException {
		//创建字节流对象
		InputStream is = new FileInputStream("a.txt");
		//通过read方法读取到一个字节，并转成字符类型
		char c1 = (char)(is.read());
		System.out.println(c1);
		
		//获取可以读取的剩余字节个数
		System.out.println(is.available());
		
		//准备字节数组容器
		byte[] arr = new byte[2];
		//将尽量多的字节读取到容器中
		System.out.println(is.read(arr));//2
		System.out.println(Arrays.toString(arr));//98,99
		//再次将尽量多的字节，读取到arr容器中
		System.out.println(is.read(arr));//1
		System.out.println(Arrays.toString(arr));//100,99
		//没有可以读取的字节，返回值为-1
		System.out.println(is.read(arr));//-1
		
	}
}
