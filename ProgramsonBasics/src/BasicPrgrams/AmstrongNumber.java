package BasicPrgrams;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn15 so= new BasicOpn15();
        boolean st3=so.isamstrong(n);
	    System.out.println(st3);

	}

}
