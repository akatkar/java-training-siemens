package com.siemens.lesson4.access.packageb;

import com.siemens.lesson4.access.packagea.C;

public class G {
	
	public void accessTest() {
		
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		c.salaryPublic = 10.0;
		
		c.publicMethod();
	}
}
