package com.ujiuye.demos;

public class Plant {
	private String name;
	private double height;
	private int age;
	public Plant() {
		super();
	}
	public Plant(String name, double height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Plant [name=" + name + ", height=" + height + ", age=" + age + "]";
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Plant other = (Plant)obj;
		if (this.name.equals(other.name) && this.age == other.age && this.height == other.height) {
			return true;
		}else {
			return false;
		}
	}*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
