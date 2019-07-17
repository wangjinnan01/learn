package com.ujiuye.demos;

import java.util.Scanner;

/**
* 		键盘录入一个纯英文字符串
		经过转换之后，
		输出结果字符串：要求首字母大写，其余字母都小写
 * @author Administrator
 *
 */
public class Demo11_转换功能练习 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		
		String str1 = line.substring(0, 1).toUpperCase();//首字母大写
		String str2 = line.substring(1).toLowerCase();//其余字母小写
		String result = str1.concat(str2);
		System.out.println(result);
		
		//链式编程：第一个方法的返回值，如果还是一个对象，那么就可以继续调用返回的对象的方法
		String result2 = line.substring(0, 1).toUpperCase().concat(line.substring(1).toLowerCase());
	}
}
