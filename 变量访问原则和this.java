package com.day07;

public class ��������ԭ���this {

	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setName("�ܿ�������");
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
