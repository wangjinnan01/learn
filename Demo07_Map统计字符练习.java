package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 	键盘录入一个字符串，例如：aaabbbcc###!!***AAA
	统计每个字符出现的次数
	a3次，b3次，c2次，#3次，!2次，*3次
	
	思路：
	 	1、不能使用计数器，要么是不知道有多少个要统计的内容，要么就是要统计的东西太多
	 	2、只能考虑使用容器，存储对应关系最合适的，就是Map
	 	3、存储字符和个数的对应关系：Map<Character, Integer>
 */
public class Demo07_Map统计字符练习 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] chs = line.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		for (char c : chs) {
			//如果以前没有统计过c，就是第一次，直接将c,1存储到map中
			/*if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				//如果以前统计过c，就不是第一次，需要将以前统计的结果+1
				map.put(c, 1);
			}*/
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		
		System.out.println(map);
	}

}
