import java.util.Scanner;
class 键盘录入 {
	public static void main(String[] args) {
	System.out.println("请输入两个整数:");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("这两个数的和为:");
	System.out.println(a + b);
	System.out.println("这两个数最大的为:");
	int max = a > b ? a : b;
	System.out.println(max);
	System.out.println("这个数是:");
	System.out.println(max % 2 == 0 ? "偶数" : "奇数");

	}
}
