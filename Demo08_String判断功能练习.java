package com.ujiuye.demos;

import java.util.Scanner;

public class Demo08_String�жϹ�����ϰ {
	/**
	 * 	ģ���û���¼��
		��ȷ�û�����admin����ȷ����123
		����¼���û��������룬�ܹ����λ���
		���¼�������ʾ¼�����ǰ���δ��󣬻���ʾʣ�༸��¼�����
		����ǵ����δ�����ʾ��¼��������
		���¼����ȷ������ʾ��¼�ɹ�
	 * @param args
	 */
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭ������¼ϵͳ");
		//���ε�¼���ᣬдһ��ѭ��
		for (int i = 1; i <= 3; i++) {
			System.out.println("��¼���û���");
			String userName = sc.nextLine();
			System.out.println("��¼������");
			String passWord = sc.nextLine();
			//������ԣ�����ʾ��¼�ɹ������ҽ���ѭ��
			if (userName.equals("admin") && passWord.equals("123")) {
				System.out.println("��¼�ɹ�");
				break;
			} else {//������ԣ����ж��ǵڼ���¼��
				if (i == 3) {
					System.out.println("��¼���󣬵�¼�����Ѿ�����");
				} else {
					System.out.println("��¼���󣬻�ʣ" + (3 - i) + "�ε�¼����");
				}
			}
		}
	}

}
