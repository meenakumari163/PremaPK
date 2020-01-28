package Stirngprograms;

import java.util.Scanner;

public class StInitcap {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		StOpn2 so= new StOpn2();
		String st3=so.initcap(st);
		 System.out.println(st3);

	}

}
