package com.exception;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Friends");
		Thread. sleep(2000);
		System.out.println("Hello");
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
