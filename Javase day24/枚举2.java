package cn.offcn.practice;

public class EnumTest_2 {
	
	public static void main(String[] args) {
		
		System.out.println(WeekDay21.MON.getName());
		System.out.println(WeekDay21.TUE.getName());
		System.out.println(WeekDay21.WED.getName());
		
		
		System.out.println(WeekDay22.MON.getName());
		System.out.println(WeekDay22.TUE.getName());
		System.out.println(WeekDay22.WED.getName());
		
	}

}

class WeekDay21{
	
	
	private String name;
	
	private WeekDay21(String name) {
		this.name=name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	static final WeekDay21 MON=new WeekDay21("星期一");
	static final WeekDay21 TUE=new WeekDay21("星期二");
	static final WeekDay21 WED=new WeekDay21("星期三");
	
}

enum WeekDay22{
	
	MON("星期一"),TUE("星期二"),WED("星期三");
	private String name;
	private WeekDay22(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}



