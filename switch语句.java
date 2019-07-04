import java.util.Scanner;
class switch语句 {
	public static void main(String[] args) {
		System.out.println("请录入:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default :
			System.out.println("对不起,录入错误!");

	}
	}
}
