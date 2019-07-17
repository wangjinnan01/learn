package com.ujiuye.demos;

import java.util.Scanner;

public class Demo08_String判断功能练习 {
	/**
	 * 	模拟用户登录：
		正确用户名是admin，正确密码123
		键盘录入用户名和密码，总共三次机会
		如果录入错误，提示录入错误，前两次错误，还提示剩余几次录入机会
		如果是第三次错误，提示登录机会用完
		如果录入正确，则提示登录成功
	 * @param args
	 */
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎来到登录系统");
		//三次登录机会，写一个循环
		for (int i = 1; i <= 3; i++) {
			System.out.println("请录入用户名");
			String userName = sc.nextLine();
			System.out.println("请录入密码");
			String passWord = sc.nextLine();
			//如果都对，则提示登录成功，并且结束循环
			if (userName.equals("admin") && passWord.equals("123")) {
				System.out.println("登录成功");
				break;
			} else {//如果不对，就判断是第几次录入
				if (i == 3) {
					System.out.println("登录错误，登录机会已经用完");
				} else {
					System.out.println("登录错误，还剩" + (3 - i) + "次登录机会");
				}
			}
		}
	}

}
