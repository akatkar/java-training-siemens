package com.siemens.lesson6.anonym;

public class Application {
	
	static class MyThread implements Runnable {

		@Override
		public void run() {
			System.out.println("Inherited thread run");
			System.out.println(Thread.currentThread().getName());	
		}
		
	}
	
	public static void main(String[] args) {
		
		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("anonymous thread run");
				System.out.println(Thread.currentThread().getName());
			}
		};
	
		new Thread(myRunnable, "Garbage Collector").start();
		new Thread(myRunnable, "Port Scanner").start();
		new Thread(new MyThread(), "Message Sender").start();
		
		myRunnable = new MyThread();
		
		System.out.println(Thread.currentThread().getName());

	}
}
