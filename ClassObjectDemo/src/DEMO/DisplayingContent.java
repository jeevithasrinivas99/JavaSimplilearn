package DEMO;
import java.util.Scanner;

public class DisplayingContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int fact_var=1;//declaring variables
Scanner Sc=new Scanner(System.in);//input from users
System.out.println("enter a number:");
n=Sc.nextInt();

for(int i=1;i<=n;i++)
{
	fact_var=fact_var*i;
}
System.out.println("factorial of number "+n+" is "+fact_var);
	}

}
