package com.siemens.lesson4.modifier;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(DateUtil.format(today));
	}
}
