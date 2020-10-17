import java.util.*;
import java.io.*;
class gcd 
{
	Scanner sc = new Scanner(System.in);
	// Program to calculate Gcd 
	public void gcd(){
		int gcd =0;
		System.out.println("This Program is used to calculate Greatest Common Factor between two numbers");
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b  = sc.nextInt();
		for (int i=1;i<=a && i<=b ; i++)
		{
			if (a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		System.out.println("GCD of "+a+ " and "+b+" is "+gcd);
	}
	public static void main(String[] args) 
	{
		gcd obj = new gcd();
		obj.gcd();
	}
}
