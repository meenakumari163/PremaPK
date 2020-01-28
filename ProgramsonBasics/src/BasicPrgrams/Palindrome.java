package BasicPrgrams;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn9 so= new BasicOpn9();
        int st3=so.palindrome(n);
	    System.out.println(st3);


	}

}
