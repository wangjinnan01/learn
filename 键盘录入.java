import java.util.Scanner;
class ����¼�� {
	public static void main(String[] args) {
	System.out.println("��������������:");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("���������ĺ�Ϊ:");
	System.out.println(a + b);
	System.out.println("������������Ϊ:");
	int max = a > b ? a : b;
	System.out.println(max);
	System.out.println("�������:");
	System.out.println(max % 2 == 0 ? "ż��" : "����");

	}
}
