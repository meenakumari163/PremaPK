package BasicPrgrams;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn13 so= new BasicOpn13();
	    boolean st3=so.isstrong(n);
	    if (st3)
	    System.out.println(n+"  is  strong number");
	    else
	    System.out.println(n+"  is  not a strong number");
	}

}
