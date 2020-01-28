package Stirngprograms;

import java.util.Scanner;

public class StPalindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		StOpn so= new StOpn();
		boolean st3=so.ispalindrome(st);
		 System.out.println(st3);


	}

}
