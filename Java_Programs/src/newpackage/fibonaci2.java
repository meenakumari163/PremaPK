package newpackage;

import java.util.Scanner;

public class fibonaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in); 
		System.out.println("enter the range:.........");
		int range=scn.nextInt();
		int a=0;
		int b=1; 
		int c=0; 
		System.out.print(a);
		System.out.print(b); 
		for (int i = 2; i <=range; i++)
		{ 
			c=a + b;
		
		 
		 if(c<=range) 
		 
		 { 
			 //c=a + b;
			 
			 System.out.print(c);
			 
			 a=b; 
			 b=c; 
			 } 
		 } 
	} }
		 