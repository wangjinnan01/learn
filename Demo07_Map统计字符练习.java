package com.ujiuye.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 	����¼��һ���ַ��������磺aaabbbcc###!!***AAA
	ͳ��ÿ���ַ����ֵĴ���
	a3�Σ�b3�Σ�c2�Σ�#3�Σ�!2�Σ�*3��
	
	˼·��
	 	1������ʹ�ü�������Ҫô�ǲ�֪���ж��ٸ�Ҫͳ�Ƶ����ݣ�Ҫô����Ҫͳ�ƵĶ���̫��
	 	2��ֻ�ܿ���ʹ���������洢��Ӧ��ϵ����ʵģ�����Map
	 	3���洢�ַ��͸����Ķ�Ӧ��ϵ��Map<Character, Integer>
 */
public class Demo07_Mapͳ���ַ���ϰ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] chs = line.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		for (char c : chs) {
			//�����ǰû��ͳ�ƹ�c�����ǵ�һ�Σ�ֱ�ӽ�c,1�洢��map��
			/*if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				//�����ǰͳ�ƹ�c���Ͳ��ǵ�һ�Σ���Ҫ����ǰͳ�ƵĽ��+1
				map.put(c, 1);
			}*/
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		
		System.out.println(map);
	}

}
