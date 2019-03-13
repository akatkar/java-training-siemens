package com.siemens.lesson6.anonym;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Application2 {
	
	public static void sendForm() {
		
	}
	
	public static void main(String[] args) {
		
		JButton submit = new JButton();
		submit.setText("Submit");
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				sendForm();
			}
		});
		
		submit.addActionListener(event -> sendForm());
		
	
		new Thread(() -> {  
			System.out.println("Lambda thread run 1"); 
			System.out.println(Thread.currentThread().getName());
		}, "Garbage Collector").start();
		
		new Thread(()->System.out.println("Lambda thread run 2 "), "Port Scanner").start();
		new Thread(()->System.out.println("Lambda thread run 3"), "Message Sender").start();
		
		Runnable myRunnable = ()->System.out.println("Lambda thread run");
		new Thread(myRunnable);
		System.out.println(Thread.currentThread().getName());

	}
}
