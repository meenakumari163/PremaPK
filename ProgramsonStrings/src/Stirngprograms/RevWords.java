package Stirngprograms;

import java.util.Scanner;

public class RevWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		StOpn4 so= new StOpn4();
		String st3=so.reverseword(st);
		 System.out.println(st3);


	}

}
