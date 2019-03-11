package com.siemens.lesson4.access.packagea;

public class F {
	public static void main(String[] args) {
		C c = new C();
		c.idProtected = "45";
		c.nameDefault = "Jean Darc";
		c.salaryPublic = 15.000;
		
		c.defaultMethod();
		c.protectedMethod();
		c.publicMethod();
		//c.privateMethod();
		System.out.println("finished");
	}
}
