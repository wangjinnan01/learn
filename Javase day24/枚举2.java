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



	static final WeekDay21 MON=new WeekDay21("����һ");
	static final WeekDay21 TUE=new WeekDay21("���ڶ�");
	static final WeekDay21 WED=new WeekDay21("������");
	
}

enum WeekDay22{
	
	MON("����һ"),TUE("���ڶ�"),WED("������");
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



