package com.exception;

public class AddArguments {

	public static void main(String[] args) {
		 try {
			 int sum = 0;
	
			 for (int i=0; i < args.length; i++) {
			 sum += Integer.parseInt (args [i]);//sum+Integer.parseInt(args[i]) 
		
			 }
			 System.out.println("sum "+sum);
			  } catch (NumberFormatException nfe) {
			 System.out.println("one of the command line"+ "arguments are integer");
	}

	}
	}
	
