import java.util.Scanner;
class if第二种格式 {
	public static void main(String[] args) {
	System.out.println("皇上,该歇歇了:");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if (x == 1){
	System.out.println("皇后准备开始侍寝!");
	}else if(x == 3){
	System.out.println("贵妃准备开始侍寝!");
	 }else if(x == 2){
	 System.out.println("唐艺昕准备!");
	 }

	 //if语句外部定义一个变量时出现的错误
	  int a ;
	  if (x > 1){
	  a = 2;
	  }
	  System.out.println(a);

	}
}
