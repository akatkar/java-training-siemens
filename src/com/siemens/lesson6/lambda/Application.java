package com.siemens.lesson6.lambda;

public class Application {
	
	public static void doFly(Flyable flyable) {
		flyable.fly();
	}
	
	public static void main(String[] args) {
		
		Plane plane = new Plane();
		doFly(plane);
		doFly(new Plane());
		Eagle eagle = new Eagle();
		doFly(eagle);
		doFly(new Eagle());
		
		doFly(new Flyable() {
			
			@Override
			public void fly() {
				System.out.println("Helicopter flies with engine");				
			}

			@Override
			public int distance() {
				return 1000;
			}
		});
		
		// We just added new method into Flyable interface
		// so we can not use lambda expression anymore
		//Flyable falcon = ()->System.out.println("Falcon flies with its wings");
		
		//doFly(falcon);
	}
}
