package com.mphasis;

public class ThreadDemo extends Thread  {
 
	public static void main(String[] args) {

	/*
	 * for (int i = 0; i < 5; i++) {
	 * 
	 * System.out.println("main-thread"); }
	 */

	ThreadDemo td1 = new ThreadDemo();

	td1.setName("child1");
	td1.setPriority(5);

	ThreadDemo td2 = new ThreadDemo();

	td2.setName("child2");
	td2.setPriority(5);

	// System.out.println(td);

	td1.start();
	td2.start();

}

@Override
public void run() { // td - child thread

	System.out.println("run() from current class");

	for (int i = 0; i < 5; i++) {

		System.out.println(Thread.currentThread().getName());
	}

}

}



