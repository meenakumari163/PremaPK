package Stirngprograms;

import java.util.Scanner;

public class MainS2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		StringOperations so= new StringOperations();
		String st3=so.tolowercase(st);
		 System.out.println(st3);

	}

}
