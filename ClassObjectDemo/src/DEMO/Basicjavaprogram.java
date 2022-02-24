package DEMO;
import java.util.Scanner;
public class Basicjavaprogram {
public static void main(String[] args) {
	int num1,num2;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first number:");
	num1=sc.nextInt();
	System.out.println("enter the second number:");
	num2=sc.nextInt();
	System.out.println("arithmetic operations of two numbers are:");
	System.out.println("addition of two numbers are:"+(num1+num2));
	System.out.println("subtraction of two numbers are:"+(num1-num2));
	System.out.println("multiplication of two numbers are:"+(num1*num2));
	System.out.println("division of two numbers are:"+(num1/num2));
	System.out.println("modulus of two numbers are:"+(num1%num2));
	
	
}
}
