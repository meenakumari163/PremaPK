package BasicPrgrams;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn7 so= new BasicOpn7();
        int st3=so.factorial(n);
	    System.out.println(st3);

	}

}
