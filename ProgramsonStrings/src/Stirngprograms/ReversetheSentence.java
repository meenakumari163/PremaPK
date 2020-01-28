package Stirngprograms;

import java.util.Scanner;

public class ReversetheSentence {

	public static void main(String[] args) {
	
       Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		StOpn3 so= new StOpn3();
		String st3=so.reverasent(st);
		 System.out.println(st3);

		

	}

}
