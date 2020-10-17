import java.util.*;
import java.io.*;
class Armstrong 
{
	Scanner sc = new Scanner(System.in);
	// Program to find Armstrong Number-- 
	public void num(){
	System.out.println("This Program is used to check whether a number is Armstrong or Not---");
	System.out.print("Enter any Number: ");
	int n = sc.nextInt();
	int temp = n, sum = 0;
	while (temp>0)
	{
		int m = temp%10;
		sum = sum +(m*m*m);
		temp = temp/10;
	}
	if (sum == n)
	{
		System.out.println("Number "+n+ " is Armstrong number");
	}
	else{
	System.out.println("Number "+n+" is not Armstrong Number");
	}
	}
	public static void main(String[] args) 
	{
		Armstrong obj = new Armstrong();
		obj.Armstrong();
	}
}