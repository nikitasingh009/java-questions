import java.util.*;
import java.io.*;
class Reverse 
{
	Scanner sc = new Scanner(System.in);
	// Reverse of a String---
	public void reverse(){
	System.out.println("This Program is to print the reverse of a String-----");
	System.out.print("Enter any String to reverse: ");
	String str = sc.nextLine();
	if (str==null)
	{
		System.out.println("Reverse of String is: "+str);
	}
	StringBuilder input = new StringBuilder();
	input.append(str);
	input = input.reverse();
	System.out.println("Reverse of String "+ str+ "is: "+input);
	}
	public static void main(String[] args) 
	{
		Reverse obj = new Reverse();
		obj.reverse();
	}
}