package cn.offcn.practice;

public class EnumTest_1 {
	
	public static void main(String[] args) {
		
		System.out.println(WeekDay11.MON);
		System.out.println(WeekDay11.TUE);
		System.out.println(WeekDay11.WED);
		
		System.out.println(WeekDay12.MON);
		System.out.println(WeekDay12.TUE);
		System.out.println(WeekDay12.WED);
		
	}

}

class WeekDay11{
	
	static final WeekDay11 MON=new WeekDay11();
	static final WeekDay11 TUE=new WeekDay11();
	static final WeekDay11 WED=new WeekDay11();
	
	private WeekDay11() {
		
	}
}

enum WeekDay12 {
	
	MON,TUE,WED;
}

