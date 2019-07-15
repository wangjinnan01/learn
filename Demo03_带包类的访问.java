package com.ujiuye.demos;

import com.ujiuye.homeworks.NewPhone;

public class Demo03_带包类的访问 {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call();
		np.sendMessage();
		np.playGame();
		
		java.util.Date d = new java.util.Date();
		java.sql.Date d2 = new java.sql.Date(666);
	}
}
