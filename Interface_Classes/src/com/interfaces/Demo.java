package com.interfaces;

public class Demo {

	public static void main(String[] args) {
		InnerDemo d  = new Demo.InnerDemo();
		
		d.innerDemo();

}



private	static class  InnerDemo{
	
	 public void innerDemo() {
		 
		 System.out.println("demo from inner class");
	 }
	
}


		
	}


