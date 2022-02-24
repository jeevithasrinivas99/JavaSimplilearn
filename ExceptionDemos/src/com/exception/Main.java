package com.exception;

public class Main {

	public static void main(String[] args) {
		//throw new ArithmeticException();// explicitly raising exp
		System.out.println("welcome to bank");
		int accounts[]= {101,102,103,104};
		String names[]= {"jeev","dak","tan"," res ","app"};
		double balance[]= {5000.0,7000.00,6000.0,700.0,8000.0};
	  for(int i=0;i<accounts.length;i++)
	
			//System.out.println(accounts[i1]+" "+names);
		if(balance[i]<1000)
			try{
				throw new LowBalanceException();
			}
	catch(LowBalanceException e)
		{
			System.out.println(names[i]+ "your balance is low please deposit");
		}
	}
}
