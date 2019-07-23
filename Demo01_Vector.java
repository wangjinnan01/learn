package com.ujiuye.demos;

import java.util.Enumeration;
import java.util.Vector;

public class Demo01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("abc");
		v.addElement("bcd");
		v.addElement("xyz");
		v.addElement(123);
		
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			Object obj = en.nextElement();
			System.out.print(obj + " ");
		}
		
	}

}
