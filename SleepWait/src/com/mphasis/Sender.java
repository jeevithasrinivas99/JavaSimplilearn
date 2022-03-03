package com.mphasis;

public class Sender {
	public void send(String msg) {
		System.out.println("sending" +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			System.out.println("message sent"+msg);
		}
	
	}

}
