package Stirngprograms;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		StringOperations so= new StringOperations();
		int st3=so.sumofdigits(st);
		 System.out.println(st3);


	}

}
