package com.day07;

public class 变量访问原则和this {

	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setName("周口彭于晏");
		System.out.println(p.getName());
	}

}
  class Person {
	  private String name;
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getName() {
		  return name;
	  }
  }
