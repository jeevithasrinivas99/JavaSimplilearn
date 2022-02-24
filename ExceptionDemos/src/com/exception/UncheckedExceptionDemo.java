package com.exception;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		int num=100;
		int result=0;
		System.out.println("open file");
		System.out.println("Read file");
		System.out.println("oprocess data");
		//int result=num/10;
		//int result=num/0; // termination
		//int result= UncheckedExceptionDemo.div(4,2);
		try {
			result =  UncheckedExceptionDemo.div(4,2); //main- caller result =  UncheckedExceptionDemo.div(4,0);
				}catch(ArithmeticException e) {
					
					//e.printStackTrace();
					System.err.println("Sorry You can't div num by zero");
					
				}	
			System.out.println(result);
			System.out.println("Close file");

		}
		
		
		public static int  div(int num1,int num2)throws ArithmeticException { //callee
			
			
			return num1/num2;
			
		}
		
}