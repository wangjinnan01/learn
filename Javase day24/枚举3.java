package cn.offcn.practice;

public class EnumTest_3 {
	
	public static void main(String[] args) {
		
		WeekDay31.MON.show();
		WeekDay31.TUE.show();
		WeekDay31.WED.show();
		
		System.out.println(WeekDay32.MON.show());
		System.out.println(WeekDay32.TUE.show());
		System.out.println(WeekDay32.WED.show());
		
	}

}

abstract class WeekDay31{
	
	
	private String name;
	
	private WeekDay31(String name) {
		this.name=name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public abstract void show();

	static final WeekDay31 MON=new WeekDay31("星期一") {
		public void show() {
			System.out.println(getName());
		}
	};
	static final WeekDay31 TUE=new WeekDay31("星期二"){
		public void show() {
			System.out.println(getName());
		}
	};
	static final WeekDay31 WED=new WeekDay31("星期三"){
		public void show() {
			System.out.println(getName());
		}
	};
	
}


enum WeekDay32{
	
	MON("星期一"){
		public String show() {
			return getName();
		}
	},TUE("星期二"){
		public String show() {
			return getName();
		}
	},WED("星期三"){
		public String show() {
			return getName();
		}
	};
	private String name;
	private WeekDay32(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String show();
	
	
}



