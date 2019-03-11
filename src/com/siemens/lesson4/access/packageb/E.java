package com.siemens.lesson4.access.packageb;

import com.siemens.lesson4.access.packagea.C;

public class E extends C {
	
	public void accessTestMethod() {
		this.idProtected = "34";
		this.protectedMethod();
	}

	public static void main(String[] args) {
		C c = new C();
		c.salaryPublic = 10.0;
		
		c.publicMethod();
		
		E e = new E();
		e.accessTestMethod();
		
	}
}
